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
		
		double a = Integer.parseInt(str[0]);
		double b = Integer.parseInt(str[1]);
		
		bw.write(Double.toString(a/b));
		bw.flush();
		bw.close();

	}

}
