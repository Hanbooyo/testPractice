package softeer;

import java.util.*;
import java.io.*;


public class softeerL2Ex03
{   
    //숫자별 ON OFF 배열
    public static int[][] arr = {
            {1, 1, 1, 0, 1, 1, 1}, // 0
            {0, 0, 1, 0, 0, 0, 1}, // 1
            {0, 1, 1, 1, 1, 1, 0}, // 2
            {0, 1, 1, 1, 0, 1, 1}, // 3
            {1, 0, 1, 1, 0, 0, 1}, // 4
            {1, 1, 0, 1, 0, 1, 1}, // 5
            {1, 1, 0, 1, 1, 1, 1}, // 6
            {1, 1, 1, 0, 0, 0, 1}, // 7
            {1, 1, 1, 1, 1, 1, 1}, // 8
            {1, 1, 1, 1, 0, 1, 1}, // 9
            {0, 0, 0, 0, 0, 0, 0} // 없음
        };

    public static void main(String args[]) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));       
     
        int T = Integer.parseInt(reader.readLine()); // 테스트 횟수

        for(int k=0; k<T; k++) {

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());
            int[] arrA = new int[5];
            int[] arrB = new int[5];


            // 배열 초기화
            Arrays.fill(arrA, -1);  
            Arrays.fill(arrB, -1);

            // 각 자릿수별로 분리
            for (int i = 0; i < 5; i++) {
                arrA[i] = A % 10;
                A /= 10;
                if (A == 0) break;
            }
            for (int i = 0; i < 5; i++) {
                arrB[i] = B % 10;
                B /= 10;
                if (B == 0) break;
            }

            //count의 합을 더할 변수
            int res = 0;

            for (int i = 0; i < 5; i++) {
                if (arrA[i] != arrB[i]) {
                    if (arrA[i] == -1) {
                        res += sum(arrB[i]);
                    } else if (arrB[i] == -1) {
                        res += sum(arrA[i]);
                    } else {
                        res += calcDiff(arrA[i], arrB[i]);
                    }
                }
            }
            sb.append(res).append("\n"); // 두 줄로 나눠 표시될 수 있도록 나눔
        }
        System.out.println(sb);
    }

    private static int calcDiff(int a, int b) {
        int[] arrA = arr[a];
        int[] arrB = arr[b];

        int cnt = 0;

        for (int i = 0; i < 7; i++) {
            if (arrA[i] != arrB[i]) {
                cnt++;
            }
        }

        return cnt;
    }

    private static int sum(int a) {
        int[] target = arr[a];

        int cnt = 0;

        for (int i = 0; i < 7; i++) {
            cnt += target[i];
        }

        return cnt;
    }
}