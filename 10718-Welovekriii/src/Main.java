import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "강한친구 대한육군\n" + 
				"강한친구 대한육군";
		
		bw.write(str);
		bw.flush();
		bw.close();
	}

}
