import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] participant = {"leo", "kiki", "eden"}; //마라톤 참가자 
//		String[] completion = {"eden", "kiki"}; //마라톤 완주자 
		
//		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"}; //마라톤 참가자 
//		String[] completion = {"josipa", "filipa", "marina", "nikola"}; //마라톤 완주자 
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; //마라톤 참가자 
		String[] completion = {"stanko", "ana", "mislav"}; //마라톤 완주자 
		
		String answer = "";
		
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i=0; i<participant.length; i++) {
			for(int j=0; j<completion.length; j++) {
				if(completion[j].equals(participant[i])) {
					map.put(i, true);
					completion[j] = "-1";
					break;
				}
				else if(j == completion.length-1) {
					map.put(i, false);
				}
			}
		}
		
		for(int i=0; i<participant.length; i++) {
			if(map.get(i) == false) {
				answer = participant[i];
				break;
			}
		}
		
        
		System.out.println(answer);

	}

}
