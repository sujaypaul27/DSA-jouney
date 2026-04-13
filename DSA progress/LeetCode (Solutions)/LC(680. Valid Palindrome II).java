class Solution {
    private boolean isPalindrome(String s,int left,int right){// Helper function to check if a substring is a palindrome
        
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=-0;
        int right=n-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return isPalindrome(s,left+1,right)||isPalindrome(s,left,right-1);// If the characters at left and right pointers are not equal, we have two options:
            }
            left++;
            right--;
        }
        return true;// If we reach here, it means the string is already a palindrome
    }
}