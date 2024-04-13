package pro_buddy;

import java.util.Arrays;

public class Sum_of_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
    for(int i =1;i<=100;i++) {
    	System.out.println(i);
    	//Arrays.toString(i);
    	sum=sum+(i*i);
    }
    System.out.println("Sum of square of first one hundered natural numbers is : "+sum);
    
    int sum1=0;
    for(int j =1;j<=100;j++) {
    	//System.out.println(i);
    	//Arrays.toString(i);
    	sum1=(sum1+j);
    	
    }
    int temp = sum1*sum1;
    System.out.println("Sum1 is:"+sum1);
    System.out.println("square of sum of first one hundred natural numbers is "+temp);
    System.out.println("difference between the sum of the squares of the first one hundred natural numbers and the square of the sum : "+(temp-sum));
    
	}

}
