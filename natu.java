package pro_buddy;

import java.util.Scanner;

public class natu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter starting point");
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		System.out.println("Enter ending point");
		int end = s.nextInt();
		// int []a=s.nextInt();

		if (start > 0 && end > start) {
			System.out.println("The numbers are as follows");
			int sum = 0;
			for (int i = start; i < end; i++) {
                      boolean a = (i % 3 == 0);
                      boolean b= (i % 5 == 0);
                      
				if (a || b) {
					System.out.println("Number which is multiple of 3 or 5 are:" + i);

					sum = sum + i;

				}

			}
			System.out.println("Sum is" + sum);
		}

		else {
			System.out.println("Enter start and end values greater than 0");
		}

	}

}
