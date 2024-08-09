package weektwo;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int org_num = num;
		while(org_num > 0) {
			int temp = org_num%10;
			total = total+ temp*temp*temp;
			org_num /=10;
		}
        if(total == num) {
        	System.out.println("Given number is armstrong number");
        }
        else {
        	System.out.print("Given number is not armstrong number");
        }
	}

}
