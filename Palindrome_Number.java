
//A palindromic number reads the same both ways. The largest palindrome made from the product of two digit numbers is 9099(91*99)
//Find the largest palindrome made from the product of two 3 digit numbers 


package pro_buddy;

public class Palindrome_Number {
	static int reversed = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		int start = 100; // start of the range
        int end = 999;   // end of the range
        int largestPalindrome = 0;

        for (int i = end; i >= start; i--) {
            for (int j = end; j >= start; j--) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        System.out.println("The largest palindrome within the range [" + start + ", " + end + "] is: " + largestPalindrome);
    }

    // Function to check if a number is palindrome
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
			
		    }


		    
			
}

