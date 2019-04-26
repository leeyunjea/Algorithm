import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		
		String p[] = br.readLine().split(" ");
		String p2 = "";
		
		for(int i=0; i<n; i++) {
			if(x > Integer.parseInt(p[i])) {
				p2 = p2 + Integer.parseInt(p[i]) + " ";
			}
		}
		
		
		
		bw.write(p2);
		bw.flush();
		bw.close();
		
	}

}
