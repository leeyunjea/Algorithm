import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int kilogram = Integer.parseInt(br.readLine());
		int bongi = 0;
		int quotient = kilogram/5;

		while(true) {
			
			int remainder = kilogram - (5*quotient);
			
			if(remainder%3 == 0) {
				bongi = quotient + (remainder/3);
				break;
			}
			else if(quotient == 0){
				if(remainder%3 == 0) {
					bongi = remainder/3;
					break;
				}
				else {
					bongi = -1;
					break;
				}
			}
			else {
				quotient--;
			}
			
		}
		

		bw.write(Integer.toString(bongi));
		bw.flush();
		bw.close();
	}

}
