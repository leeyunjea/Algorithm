import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//		String[][] clothes = { { "crow_mask", "face" }, { "blue_sunglasses", "face" }, { "smoky_makeup", "face" } };

		int answer = 0;

		Map<String, Integer> map = new HashMap<String, Integer>();

		int size = clothes.length;

		for (int i = 0; i < size; i++) {
			if (map.get(clothes[i][1]) == null) {
				map.put(clothes[i][1], 1);
			} else {
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
			}

		}
		
		int size2 = 1;
		
		boolean check = false;

		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
//			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
			if(map.size() == 1) {
				answer = map.get(key);
				check = true;
				break;
				// return answer;
			}else {
				size2 *= map.get(key);
				check = false;
			}
		}
		if(check) {
			System.out.println(answer);
		}else {
			answer = size + size2;
			System.out.println(answer);
		}
		
		//return answer

		

	}

}
