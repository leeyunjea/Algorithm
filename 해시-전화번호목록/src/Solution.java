import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"123", "456", "789"};
		String[] phone_book = {"12", "123", "1235", "567", "88"};
		
		boolean answer = true;
		
		for(int i=0; i<phone_book.length-1; i++) {
			for(int j=i+1; j<phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) answer = false;
				if(phone_book[j].startsWith(phone_book[i])) answer = false;
			}
		}
		
		System.out.println(answer);

	}

}
