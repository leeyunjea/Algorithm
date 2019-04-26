import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) {
	   
      Scanner S = new Scanner(System.in);
      while (S.hasNextLine()) {
         String input = S.nextLine();
         System.out.println(input);
      }
      S.close();
   }
   
}