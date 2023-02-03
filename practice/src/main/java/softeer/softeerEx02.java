package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class softeerEx02 {

	public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        for(int i=0; i<5; i++){
        	String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String[] time = str.split(" ");
            String[] start = time[0].split(":");
            String[] end = time[1].split(":");
            int a = Integer.parseInt(start[0]);  
            int b = Integer.parseInt(start[1]);  
            int c = Integer.parseInt(end[0]);
            int d = Integer.parseInt(end[1]);
            if( d >= b) {
                result += ((c-a)*60 + (d-b));
            }else if( b > d) {
                result += ((c-a-1)*60 + (d-b+60));
            }
        }
        System.out.println(result);
    }

}


