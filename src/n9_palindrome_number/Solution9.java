package n9_palindrome_number;

public class Solution9 {
     public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }
        return reversed == original;
     }

    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        System.out.println(solution.isPalindrome(121));
    }
}
