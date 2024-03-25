package pro_buddy;

import java.util.Scanner;

public class prim_factor {
//static int temp;
	public static void main(String[] args) {

		System.out.println("enter number");

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// int temp=0;
		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				int count = 0;
				for (int k = 1; k <= i; k++) {
					if (i % k == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println("value of i is" + i);
					// int temp =i;
					// System.out.println("temp values are :-"+temp);
					char[] temp = ("" + i).toCharArray();
					
					for (int j = 0; j < temp.length; j++) {
						System.out.println("temp value is:-" + temp[j]);
//						  int maxNumber = temp[0];
//
//					        // Iterate through the array starting from the second element
//						  for (int j = 1; j < temp.length; j++) {
//					            if (temp[j] > maxNumber) {
//					                maxNumber = temp[j];
//					                System.out.println("The largest number in the array is: " + maxNumber);
//					            }

					}

				}
			}
		}
	}
}
