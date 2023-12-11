package hashMapTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArrayTest {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>(
				Arrays.asList(new Product("족발", 39000, 10), new Product("보쌈", 45000, 10)));
		//Product 객체를 넣는 ArrayList를 만듬 이름은 productList
		
		ArrayList<JSONObject> productJSONs = new ArrayList<JSONObject>();
		//JSONObject 객체를 넣는 ArrayList를 만듬 이름은 productJSONs
		
		productList.stream().map(product -> new JSONObject(product)).forEach(productJSONs::add);
		//productList의 Product를 stream().map을 이용하여 product를 JSONObject형식으로 만들어주고
		//forEach문에서 productList의 값들을 JSONOject타입으로 변환한걸 하나씩 productJSONs에 넣어준다
		
		System.out.println(productJSONs);
		//넣어준걸 확인하면 JSON형식으로 Product타입인 족발과 보쌈이 잘 들어간걸 확인 할 수 있다.
		
		JSONArray products = new JSONArray(productJSONs);
		//JSONArray형식의 products를 만듬 거기에다가 ArrayList<JSONObject> 형식의 productJSONs를 담아준다
		
		System.out.println(products);
		//잘들어갔는지 확인해보고
		
		for (int i = 0; i < products.length(); i++) {	//products의 길이만큼 for문을 돌릴꺼임
			try {
				System.out.println(products.getJSONObject(i).get("productName"));
				//products에서 JSONObject 타입의 productJSONs를 가져와서 productName의 value 값을 가져온다
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
	}
}
