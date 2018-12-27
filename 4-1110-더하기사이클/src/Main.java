import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int cycle = 0;
		int newn = n;
		int ten = 0;
		int one = 0;
		
		while(true) {
			
			if(newn < 10) {
				ten = 0;
				one = newn;
			}
			else {
				ten = newn/10;
				one = newn%10;
			}
			newn = (one*10) + ((ten+one)%10);
			cycle++;
			
			
			if(newn == n) {
				break;
			}
		}
		
		bw.write(Integer.toString(cycle));
		bw.flush();
		bw.close();
	}

}
