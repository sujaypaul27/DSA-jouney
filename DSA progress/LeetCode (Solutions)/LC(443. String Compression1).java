class Solution {
    public int compress(char[] chars) {
       int n = chars.length;
       int left = 0;
       int right = 0;
       int index = 0;
       while ( left < n)
       {
        // while( left < n && chars[left] != chars[right]) left++;// to move pointert at first char no need
        chars[index] = chars[left];
        index++;// to increment index

        while (right < n && chars[left] == chars[right]) right++;// to move pointer at after ending point

        int length = right -left;// to calculate length

        if( length > 1) 
        {
            String count = String.valueOf(length);
            for(char ch : count.toCharArray())
            {
                chars[index]=ch;
                index++;
            }
            
        }

        left = right ;// to move pointer to nmext occurance
       }
       return index;
    }
}