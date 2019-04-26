import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String str[] = br.readLine().split(" ");
		double arr[] = new double[n];
		
		int max = Integer.parseInt(str[0]);
		
		for(int i=1; i<n; i++) {
			if(max < Integer.parseInt(str[i])) {
				max = Integer.parseInt(str[i]);
			}
		}
		double sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = (Double.parseDouble(str[i])/max)*100.0;
			sum += arr[i];
		}
		
		
		
		bw.write(Double.toString(sum/n));
		bw.flush();
		bw.close();
		
	}

}
