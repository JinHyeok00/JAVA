package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
//		아이디, 비밀번호, 이름, 나이
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJSON = null;
		userMap.put("id", "hds");
		userMap.put("password", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		String json = null;
		
		userJSON = new JSONObject(userMap);
		System.out.println(userJSON);
		
		try {
			userJSON.put("gender", "none");
			System.out.println(userJSON);
			
			json = userJSON.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			userJSON = new JSONObject(json);
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
