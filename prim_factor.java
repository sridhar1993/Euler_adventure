package pro_buddy;

import java.util.Scanner;

public class prim_factor {
//static int temp;
	public static void main(String[] args) {

		System.out.println("enter number");

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// int temp=0;
		int max = 0;

		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				int count = 0;
				for (int k = 1; k <= i; k++) {
					if (i % k == 0) {

						count++;
					}
				}
				if (count == 2) {
					System.out.println("Prime factors are:-" + i);
					if (i > max)
						max = i;
				}
			}

		}
		System.out.println("largest prime factor is: "+max);
	}
}
