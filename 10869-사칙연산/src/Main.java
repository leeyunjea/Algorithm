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
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		bw.write(Integer.toString(a+b) + "\n" + Integer.toString(a-b) + "\n" + Integer.toString(a*b) + 
				"\n" + Integer.toString(a/b) + "\n" + Integer.toString(a%b));
		bw.flush();
		bw.close();
	}

}
