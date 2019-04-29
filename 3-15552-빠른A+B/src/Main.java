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
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			String str[] = br.readLine().split(" ");
			arr[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
		}
		
		for(int i=0; i<n; i++) {
			bw.write(Integer.toString(arr[i]) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
