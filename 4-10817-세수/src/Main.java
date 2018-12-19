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
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		int arr[] = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<3; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		bw.write(Integer.toString(arr[1]));
		bw.flush();
		bw.close();
	}

}
