package softeer;

import java.util.*;
import java.io.*;


public class softeerL2Ex03
{   
    //���ں� ON OFF �迭
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
            {0, 0, 0, 0, 0, 0, 0} // ����
        };

    public static void main(String args[]) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));       
     
        int T = Integer.parseInt(reader.readLine()); // �׽�Ʈ Ƚ��

        for(int k=0; k<T; k++) {

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());
            int[] arrA = new int[5];
            int[] arrB = new int[5];


            // �迭 �ʱ�ȭ
            Arrays.fill(arrA, -1);  
            Arrays.fill(arrB, -1);

            // �� �ڸ������� �и�
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

            //count�� ���� ���� ����
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
            sb.append(res).append("\n"); // �� �ٷ� ���� ǥ�õ� �� �ֵ��� ����
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