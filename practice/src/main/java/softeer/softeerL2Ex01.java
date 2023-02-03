package softeer;

import java.util.Scanner;

public class softeerL2Ex01 {

	private static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int N = sc.nextInt();
        int result=0;
        int num = 2;
        int temp = 0;

        for(int i=1; i<=N; i++) {
            temp += Math.pow(2, i-1);
        }

        num += temp;
        result = num*num;
        System.out.println(result);
    }

}
