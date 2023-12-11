package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONtask {
	public static void main(String[] args) {
		
		//강사님 방법
		
//		1. 상품 1개를 제작하여 JSON 형식으로 변경
		Product product = new Product("감자", 1500, 85);			
		JSONObject productJSON = new JSONObject(product);		 
		
//		2. JSON 형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println(productJSON.get("productStock"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		3. 할인중인 상품 정보 제작
		Product discount = new Product("고구마", 800, 100);
		JSONObject discountJSON = new JSONObject(discount);
		JSONObject products = new JSONObject();
		
//		4. 할인 중인 상품의 KEY값은 discount로 설정
		try {
			products.put("product", productJSON);
			products.put("discount", discountJSON);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		5. JSON 형식으로 변경
		System.out.println(products);
		
//		6. JSON에 할인율 필드 추가
		 try {
			discountJSON = new JSONObject(products.get("discount")).put("discount", 50);
			products.put("discount", discountJSON);
//		7. JSON 형식의 상품 정보 중 할인율 출력
			System.out.println(((JSONObject)products.get("discount")).get("discount"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		//==============================================================================
		
//		Product product1 = new Product(1,"새우깡",1500,30);		//Product 클래스 타입의 product1 만들고
//		
//		HashMap<String, Product> userMap = new HashMap<String, Product>();	//HashMap만들고, key는 이름 value는 모든정보
//		userMap.put(product1.getName(), product1);		//userMap에 product1 넣어주기 
//		
//		
//		JSONObject userJSON = null;			//JSONObject 만들기
//		userJSON = new JSONObject(userMap);		// HashMap타입의 userMap을 JSONObject인 userJSON에 넣어 주기
//		try {									//try catch 문으로 해당되는 key값이 없을때 예외 처리 해주기
//			System.out.println(((Product) userJSON.get(product1.getName())).getStock());		//??? 이게 왜 됬는지 진짜 모름,,,, 말이 되나 왜 다운케스팅이 되는거지
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		Product product2 = new Product(2,"감자깡",2200,20);		//Product 클래스 타입의 product2, 이건 할인중인 상품
//		userMap.put("discount", product2);						//할인율을 key값으로,뒤에서 userMap에 넣어도 자동으로 userJSON에 추가가 되네
		
		
		//============================================================================================================================
		
		
//		Product product1 = new Product(1,"새우깡",1500,30);		//새우깡 만들고
//		
//		HashMap<String, Object> userMap = new HashMap<String, Object>();	
//		userMap.put("상품 번호",product1.getNum());		//정보 하나씩 넣어주고
//		userMap.put("상품 이름",product1.getName());
//		userMap.put("상품 가격",product1.getPrice());
//		userMap.put("상품 재고",product1.getStock());
//		JSONObject userJSON = new JSONObject(userMap);
//		try {	//예외 처리 해주고
//			System.out.println(userJSON.get("상품 재고"));		//재고 가져오기
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			userJSON.put("discount", false);		
//			userJSON.put("discount", 20);
//			System.out.println(userJSON.get("discount"));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}
