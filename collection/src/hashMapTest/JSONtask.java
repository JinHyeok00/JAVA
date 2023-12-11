package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONtask {
	public static void main(String[] args) {
		
		//����� ���
		
//		1. ��ǰ 1���� �����Ͽ� JSON �������� ����
		Product product = new Product("����", 1500, 85);			
		JSONObject productJSON = new JSONObject(product);		 
		
//		2. JSON ������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println(productJSON.get("productStock"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		3. �������� ��ǰ ���� ����
		Product discount = new Product("����", 800, 100);
		JSONObject discountJSON = new JSONObject(discount);
		JSONObject products = new JSONObject();
		
//		4. ���� ���� ��ǰ�� KEY���� discount�� ����
		try {
			products.put("product", productJSON);
			products.put("discount", discountJSON);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		5. JSON �������� ����
		System.out.println(products);
		
//		6. JSON�� ������ �ʵ� �߰�
		 try {
			discountJSON = new JSONObject(products.get("discount")).put("discount", 50);
			products.put("discount", discountJSON);
//		7. JSON ������ ��ǰ ���� �� ������ ���
			System.out.println(((JSONObject)products.get("discount")).get("discount"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		//==============================================================================
		
//		Product product1 = new Product(1,"�����",1500,30);		//Product Ŭ���� Ÿ���� product1 �����
//		
//		HashMap<String, Product> userMap = new HashMap<String, Product>();	//HashMap�����, key�� �̸� value�� �������
//		userMap.put(product1.getName(), product1);		//userMap�� product1 �־��ֱ� 
//		
//		
//		JSONObject userJSON = null;			//JSONObject �����
//		userJSON = new JSONObject(userMap);		// HashMapŸ���� userMap�� JSONObject�� userJSON�� �־� �ֱ�
//		try {									//try catch ������ �ش�Ǵ� key���� ������ ���� ó�� ���ֱ�
//			System.out.println(((Product) userJSON.get(product1.getName())).getStock());		//??? �̰� �� ����� ��¥ ��,,,, ���� �ǳ� �� �ٿ��ɽ����� �Ǵ°���
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		Product product2 = new Product(2,"���ڱ�",2200,20);		//Product Ŭ���� Ÿ���� product2, �̰� �������� ��ǰ
//		userMap.put("discount", product2);						//�������� key������,�ڿ��� userMap�� �־ �ڵ����� userJSON�� �߰��� �ǳ�
		
		
		//============================================================================================================================
		
		
//		Product product1 = new Product(1,"�����",1500,30);		//����� �����
//		
//		HashMap<String, Object> userMap = new HashMap<String, Object>();	
//		userMap.put("��ǰ ��ȣ",product1.getNum());		//���� �ϳ��� �־��ְ�
//		userMap.put("��ǰ �̸�",product1.getName());
//		userMap.put("��ǰ ����",product1.getPrice());
//		userMap.put("��ǰ ���",product1.getStock());
//		JSONObject userJSON = new JSONObject(userMap);
//		try {	//���� ó�� ���ְ�
//			System.out.println(userJSON.get("��ǰ ���"));		//��� ��������
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
