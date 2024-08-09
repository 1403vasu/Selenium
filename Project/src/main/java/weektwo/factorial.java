package weektwo;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i ;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		long fact = 1;
		for(i =1;i<= num; i++) {
			fact = fact*i;	
			//System.out.println();
			
		}
         System.out.print(fact);
         
	}

}
