package algorithms;

public class A5PalindromeOfBinaryRepresentation {
	
	public static boolean isPalindrome(int n)
    {
        // reverse stores reverse of a binary representation of `n`
        int reverse = 0;
 
        // store value of n in k
        int k = n;
        while (k > 0)
        {
            // add the rightmost bit to reverse
            reverse = (reverse << 1) | (k & 1);
            k = k >> 1;     // remove rightmost bit of k
        }
 
        return n == reverse;
    }
 
    public static void main(String[] args)
    {
        int n = 9;
 
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome");
        }
        else {
            System.out.println(n + " is not a palindrome");
        }
    }
}
