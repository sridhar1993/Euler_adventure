package pro_buddy;

import java.util.Scanner;

public class Prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program to enter a number and print prime factors
		System.out.println("enter number");

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				int count = 0;
				for (int k = 1; k <= i; k++) {
					if (i % k == 0) {
						count++;
					}
				}
				if (count == 2)
					System.out.println("value of i is" + i);
			}
		}

		// Program to print max of prime factors
		int[] temp = { 2, 3, 5 };
		int max = temp[0];
		// System.out.println("initial max value is:- " + max);
		for (int j = 0; j < temp.length; j++) {
			if (temp[j] > max)
				max = temp[j];

		}
		System.out.println("Max value is: "+max);

	}

}
