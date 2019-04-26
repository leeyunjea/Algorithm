import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(br.readLine());
		double percent[] = new double[c];
		
		for(int i=0; i<c; i++) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int sum = 0;
			for(int j=1; j<=n; j++) {
				sum += Integer.parseInt(str[j]);
			}
			double ave = (double)sum/n;
			int num = 0;
			for(int j=1; j<=n; j++) {
				if(ave < Integer.parseInt(str[j])) {
					num++;
				}
			}
			percent[i] = (double)num/n;
		}
		
		for(int i=0; i<c; i++) {
			bw.write(String.format("%.3f", percent[i]*100) + "%" + "\n");
		}
		bw.flush();
		bw.close();
		
	}

}
