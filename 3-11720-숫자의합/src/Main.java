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
		int sum = 0;
		
		String num = br.readLine();
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(num.substring(i, i+1));
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		
	}

}
