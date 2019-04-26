import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int score = Integer.parseInt(br.readLine());
		String grade = "";
		
		if(score >=90 && score <=100) {
			grade = "A";
		}else if(score >= 80 && score <= 89) {
			grade = "B";
		}else if(score >= 70 && score <= 79) {
			grade = "C";
		}else if(score >= 60 && score <= 69) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		bw.write(grade);
		bw.flush();
		bw.close();
	}

}
