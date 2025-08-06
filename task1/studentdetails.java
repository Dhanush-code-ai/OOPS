package task1;
import java.util.Scanner;
public class studentdetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Roll Number: ");
		long rollnumber = sc.nextLong();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Gender : ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.println("Enter Percentage : ");
		float percentage = sc.nextFloat();
		
		System.out.println("-----Student Details-----");
		System.out.println("Name : "+ name);
		System.out.println("Roll Number : "+ rollnumber);
		System.out.println("Age : "+ age);
		System.out.println("Gender : "+ gender);
		System.out.println("Percentage : "+ percentage);
		sc.close();
	 	}
	}
