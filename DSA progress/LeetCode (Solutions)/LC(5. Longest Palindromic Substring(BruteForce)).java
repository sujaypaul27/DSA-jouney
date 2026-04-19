class Solution {
    private Boolean isPalindrome(String s,int left,int right)
    {
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
    public String longestPalindrome(String s) {
        String res="";
        int n=s.length();
        for(int left=0;left<n;left++)
        {
            for(int right=left;right<n;right++)
            {
                if(isPalindrome(s,left,right)==true)
                {
                    if(right-left+1 > res.length())
                    {
                        res=s.substring(left,right+1);//coz it will take from 0 to j-1 elements only
                    }
                }
            }
        }
        return res;
    }
}//Time complexity: O(n^3) because we are checking all the substrings and for each substring we are checking whether it is palindrome or not which takes O(n) time.