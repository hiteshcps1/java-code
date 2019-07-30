package dec11;

import java.util.Scanner;

public class decimanl_to_any_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int multiplier = 1;
		int newbase = scn.nextInt();

		while (n != 0) {
			int rem = n % newbase;
			ans = ans + (rem* multiplier);
			n = n / newbase;
			multiplier = multiplier * 10;
		}
		System.out.println(ans);
	}

}
