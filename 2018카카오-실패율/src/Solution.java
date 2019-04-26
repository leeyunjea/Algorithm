
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 4;
		int[] stages = { 4, 4, 4, 4, 4 };
//		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

		int[] answer = {};
		double[] answer_temp = {};
		answer = new int[N];
		for (int i = 0; i < N; i++) {
			answer[i] = 0;
		}
		answer_temp = new double[N];

		int count = stages.length; // 스테이지의 도달한 플레이어

		for (int i = 0; i < N; i++) {
			int fail = 0; // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어

			for (int j = 0; j < stages.length; j++) {
				if (i + 1 == stages[j]) {
					fail++;
				}
			}
			answer_temp[i] = (double) fail / count;
			count = count - fail;
//			System.out.println(answer_temp[i]);
		}
		
		int index = 0;
		for(int i=0; i<N; i++) { 
			double max = -1;
			for(int j=0; j<N; j++) {
				if(max < answer_temp[j]) {
					max = answer_temp[j];
					index = j;
				}
			}
			answer[i] = index+1;
			answer_temp[index] = -1; //실패율은 -1이 나올 수 없으므로 
		}


		for (int i = 0; i < answer_temp.length; i++) {
			System.out.println(answer_temp[i]);
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

}
