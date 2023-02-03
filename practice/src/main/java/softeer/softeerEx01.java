package softeer;

import java.util.Scanner;

public class softeerEx01 {
	private static Scanner sc=new Scanner(System.in);
	 public static void main(String args[])
	    {
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        if(A > B){
	            System.out.println("A");
	        }else if (B > A) {
	            System.out.println("B");
	        }else if (A == B) {
	            System.out.println("same");
	        }
	    }

}
