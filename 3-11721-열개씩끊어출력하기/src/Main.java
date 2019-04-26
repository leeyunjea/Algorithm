import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String msg = "";
		String str2 = str;
		
		int length = 0;
		int strlength = str.length();
		
		while(true) {
			if(str2.length() < 10) {
				msg += str.substring(length, strlength);
				break;
			}
			else {
				msg = msg + str.substring(length, length+10) + "\n";
				str2 = str.substring(length+10, strlength);
				length += 10;
			}
		}
		
		bw.write(msg);
		bw.flush();
		bw.close();
	}

}
