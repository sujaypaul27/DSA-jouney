class Solution {
    private int palindromeLength(String s,int left,int right)
    {
        while(left>=0&& right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            
            left--;
            right++;
        }
        return right-left-1;//to rget the length in expand arround center pattern since we we shrink left and expand right from given i value
    }
    public String longestPalindrome(String s) {
        int start =0;
        int end=0;
        for(int i=0;i<s.length();i++){
        int oddlength=palindromeLength(s,i,i);//in odd term common will be 1
        int evenlength=palindromeLength(s,i,i+1);//in even wew have 2 terms
        int len=Math.max(oddlength,evenlength);//any 1 input will be given so only max value ip is given
        if(len>(end-start))
        {
            start=i-(len-1)/2;
            end=i+len/2;
        }
        }
        return s.substring(start,end+1);//since it takes from i to i-1 +1 is added
    }
}//Time complexity: O(n^2) because we are checking all the substrings and for each substring we are checking whether it is palindrome or not which takes O(n) time.