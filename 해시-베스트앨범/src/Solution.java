import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		for(int i=0; i<solution(genres, plays).length; i++) {
			System.out.println("answer[" + i + "] = " + solution(genres, plays)[i]);
		}

	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		Map<String, Integer> genreCnt = new HashMap<>();
		int count = 0;


		Map<String, List<Integer>> genreList = new HashMap<>();


		for(int i=0; i<genres.length; i++) {
			if(genreCnt.get(genres[i]) == null) {
				genreCnt.put(genres[i], plays[i]);
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				genreList.put(genres[i], list);
				count++;
			}else {
				genreCnt.put(genres[i], genreCnt.get(genres[i]) + plays[i]);
				List<Integer> list = genreList.get(genres[i]);
				list.add(i);
				genreList.put(genres[i], list);
			}
		}

//		for(int i=0; i<genreCnt.size(); i++) {
//			int max = genreList.get();
//			for(int j=0; j<genreList.size(); j++) {
//
//			}
//		}



		Iterator<String> keys = genreCnt.keySet().iterator();
//		while (keys.hasNext()) {
//			String key = keys.next();
//			System.out.println("genreCnt key = " + key + " value = " + genreCnt.get(key));
//
//		}

		answer = new int[count*2];

		Iterator<String> keys2 = genreList.keySet().iterator();
		while (keys2.hasNext()) {
			String key = keys2.next();
//			System.out.println("key = " + key + " value = " + genreList.get(key));

			int temp;

			for(int i=0; i<genreList.get(key).size(); i++) {
				for(int j=0; j<genreList.get(key).size()-1; j++) {
					if(plays[genreList.get(key).get(j)] < plays[genreList.get(key).get(j+1)]) {
						temp = genreList.get(key).get(j);
						genreList.get(key).set(j, genreList.get(key).get(j+1));
						genreList.get(key).set(j+1, temp);
					}
				}

			}

			System.out.println("genreList key = " + key + " value = " + genreList.get(key));

//			for(int i = 0 ; i < a.length ; i ++) {
//				for(int j = 0 ; j < a.length -i -1 ; j ++) {
//					if(a[j]>a[j+1]) {
//						b = a[j];
//						a[j] = a[j+1];
//						a[j+1] = b;
//					}
//				}
//			}


		}

		System.out.println("count = " + count);





		return answer;
	}

}
