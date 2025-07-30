package basiccode;
import java.util.Scanner;
public class evenorodd {
      public static void main(String[] args) {
    	  Scanner num= new Scanner(System.in);
    	  System.out.print("Enter a Number: ");
    	  int number = num.nextInt();
    	  
    	  if(number%2 == 0) {
    		  System.out.print(number + " is even");
    	  }
    	  else {
    		  System.out.print(number + " is odd");
    	  }
    	  num.close();
      }
}
