class Solution {
    private boolean isPalindrome(String s,int left,int right){
        
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
                return isPalindrome(s,left+1,right)||isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;// If we reach here, it means the string is already a palindrome without any removals.
    }
}// Time complexity: O(n) in the worst case, where n is the length of the string. This happens when we have to check both possibilities of removing a character. The space complexity is O(1) since we are using only a constant amount of extra space for the pointers and the helper function.