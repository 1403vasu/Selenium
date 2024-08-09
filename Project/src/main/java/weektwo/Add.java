package weektwo;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		a = sc.nextInt();
		
		System.out.println("enter the second number");
		b = sc.nextInt();
		System.out.print("enter the operation ");
		String str = sc.next();
		switch(str) {
		case "add":
		System.out.println(a+b);
		break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
			default:
				System.out.println("Invalid operation");
				break;
				
		}
		
		

	}

}
