package abstractTest;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		int[] ar = new int[1];

	}

}

class Solution {
	public int solution(int speed_limit, int[][] cameras) {
		int answer = -1;
		answer = 0;
		for (int i = 0; i < cameras.length; i++) {
			double a, b, c;
			if (i == 0) {
				c = cameras[0][0]/cameras[0][1];
				if (speed_limit+0.00000000000000000000000000001 < c) {
					answer++;
				}
			} else {
				a = cameras[i][0] - cameras[i - 1][0];
				b = cameras[i][1] - cameras[i - 1][1];
				c = a / b;
				if (speed_limit < c) {
					answer++;
				}
			}

		}
		return answer;
	}
}