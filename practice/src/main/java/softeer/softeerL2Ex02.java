package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class softeerL2Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ipt = br.readLine();
		StringTokenizer st = new StringTokenizer(ipt);
		String[] nums = ipt.split(" ");
		int temp = 0;
		if (Integer.parseInt(nums[0]) == 1) {
			temp = Integer.parseInt(nums[0]);
			temp++;
			for(int i=1; i<nums.length; i++) {
				if (temp == Integer.parseInt(nums[i])) {
					temp++;
					if(temp == 8) {
						System.out.println("ascending");
					}
				} else {
					System.out.println("mixed");
					break;
				}
			}
		} else if (Integer.parseInt(nums[0]) == 8) {
			temp = Integer.parseInt(nums[0]);
			temp--;
			for(int i=1; i<nums.length; i++) {
				if (temp == Integer.parseInt(nums[i])) {
					temp--;
					if(temp == 1) {
						System.out.println("descending");
					}
				} else {
					System.out.println("mixed");
					break;
				}
			}
		} else {
			System.out.println("mixed");
		}

	}
}
