package basiccode;

import java.util.Scanner;

public class positvenegative {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num=sc.nextInt();
	
	if(num<0) {
		System.out.print("The Number is Negative");
	}
	else if(num>0) {
		System.out.print("The Number is Positive");
	}
	else {
		System.out.print("It is Zero");
	}
	sc.close();
}
}
