import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ab[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = Integer.toString(a+b);
		bw.write(str);
		bw.flush();
		bw.close();
		
	}

}
