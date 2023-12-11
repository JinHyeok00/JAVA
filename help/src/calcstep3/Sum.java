package calcstep3;

public class Sum {
	public static void main(String[] args) {
		int[] sum = {5, 4, 3, 6};
		int result = 0;
		for (int i = 0; i < sum.length; i++) {
			result += sum[i]; 
		}
		System.out.println(result);
	}
}
