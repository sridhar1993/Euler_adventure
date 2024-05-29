package pro_buddy;

import java.util.Scanner;

public class PowerDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Enter value of a");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            System.out.println("Enter value of b");
            int b = s.nextInt();
            int c= (int) Math.pow(a, b);
            System.out.println(c);
            int sum=0;			
            while(c > 0)  
            {                 
            int digit = c % 10;               
            sum = sum + digit;    
            c = c / 10;  
            }  
            //prints the result  
            System.out.println("Sum of Digits: "+sum);            
	}
}