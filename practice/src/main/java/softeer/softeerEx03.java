package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class softeerEx03 {

	public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());  //1
            int b = Integer.parseInt(st.nextToken());  //2
            System.out.println("Case #"+(i+1)+": "+(a+b));
        }
	}

}
