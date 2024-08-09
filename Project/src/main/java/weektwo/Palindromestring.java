package weektwo;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.next();
        String orginal_st = st;
        String rev="";
        int len = st.length();
        for(int i = len-1;i>=0;i--) {
        	rev = rev+st.charAt(i);
        }
        if(orginal_st.equals(rev)) {
        	System.out.print("Given string is palindrome");}
        
        	else {
        		System.out.print("Given string is not palindrome");
        	}
        }
	

}

