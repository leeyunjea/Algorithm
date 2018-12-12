import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "|\\_/|\n" + 
				"|q p|   /}\n" + 
				"( 0 )\"\"\"\\\n" + 
				"|\"^\"`    |\n" + 
				"||_/=\\\\__|";
		
		bw.write(str);
		bw.flush();
		bw.close();
	}

}
