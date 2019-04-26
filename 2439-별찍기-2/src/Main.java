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
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				bw.write(" ");
				bw.flush();
			}
			for(int j=0; j<i; j++) {
				bw.write("*");
				bw.flush();
			}
			bw.write("\n");
		}
		
		bw.close();
	}

}
