package ARRAYS;

// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int org = x;
        long rev = 0;
        while(x != 0){
            int temp = x % 10;
            rev = rev * 10 + temp;
            x /= 10;
        }
        if(org < 0)
            return false;
        return rev == org;
    }
}