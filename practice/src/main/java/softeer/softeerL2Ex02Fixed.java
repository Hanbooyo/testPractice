package softeer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class softeerL2Ex02Fixed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipt = br.readLine();
        StringTokenizer st = new StringTokenizer(ipt);
        String[] nums = ipt.split(" ");
        System.out.println(checkOrder(nums));
    }

    private static String checkOrder(String[] nums) {
        int temp = Integer.parseInt(nums[0]);
        boolean isAscending = temp == 1;
        boolean isDescending = temp == 8;
        if (isAscending) {
            temp++;
            for (int i = 1; i < nums.length; i++) {
                if (temp == Integer.parseInt(nums[i])) {
                    temp++;
                    if (temp == 8) {
                        return "ascending";
                    }
                } else {
                    return "mixed";
                }
            }
        } else if (isDescending) {
            temp--;
            for (int i = 1; i < nums.length; i++) {
                if (temp == Integer.parseInt(nums[i])) {
                    temp--;
                    if (temp == 1) {
                        return "descending";
                    }
                } else {
                    return "mixed";
                }
            }
        } else {
            return "mixed";
        }
        return "mixed";
    }
}
