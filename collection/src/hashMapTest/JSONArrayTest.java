package hashMapTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArrayTest {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>(
				Arrays.asList(new Product("����", 39000, 10), new Product("����", 45000, 10)));
		//Product ��ü�� �ִ� ArrayList�� ���� �̸��� productList
		
		ArrayList<JSONObject> productJSONs = new ArrayList<JSONObject>();
		//JSONObject ��ü�� �ִ� ArrayList�� ���� �̸��� productJSONs
		
		productList.stream().map(product -> new JSONObject(product)).forEach(productJSONs::add);
		//productList�� Product�� stream().map�� �̿��Ͽ� product�� JSONObject�������� ������ְ�
		//forEach������ productList�� ������ JSONOjectŸ������ ��ȯ�Ѱ� �ϳ��� productJSONs�� �־��ش�
		
		System.out.println(productJSONs);
		//�־��ذ� Ȯ���ϸ� JSON�������� ProductŸ���� ���߰� ������ �� ���� Ȯ�� �� �� �ִ�.
		
		JSONArray products = new JSONArray(productJSONs);
		//JSONArray������ products�� ���� �ű⿡�ٰ� ArrayList<JSONObject> ������ productJSONs�� ����ش�
		
		System.out.println(products);
		//�ߵ����� Ȯ���غ���
		
		for (int i = 0; i < products.length(); i++) {	//products�� ���̸�ŭ for���� ��������
			try {
				System.out.println(products.getJSONObject(i).get("productName"));
				//products���� JSONObject Ÿ���� productJSONs�� �����ͼ� productName�� value ���� �����´�
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
	}
}
