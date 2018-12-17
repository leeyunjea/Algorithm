import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int month_day[][] = {{0}, {31}, {28}, {31}, {30}, {31}, {30}, {31}, {31}, {30}, {31}, {30}, {31}};
		
		String read[] = br.readLine().split(" ");
		
		int month = Integer.parseInt(read[0]);
		int day = Integer.parseInt(read[1]);
		
		int sum = 0;
		for(int i=0; i<month; i++) {
			sum += month_day[i][0];
		}
		sum += day;
		
		String week = "";
		
		switch(sum%7) {
		case 0:
			week = "SUN";
			break;
		case 1:
			week = "MON";
			break;
		case 2:
			week = "TUE";
			break;
		case 3:
			week = "WED";
			break;
		case 4:
			week = "THU";
			break;
		case 5:
			week = "FRI";
			break;
		case 6:
			week = "SAT";
			break;
		}
		
		bw.write(week);
		bw.flush();
		bw.close();
	}

}
