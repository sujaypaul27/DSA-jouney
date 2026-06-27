class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < n)
        {
            while(i < n && s.charAt(i) == ' ' ) i++;
            if (i == n)  break;
            j = i + 1;// important to remove out of index
            while( j < n  && s.charAt(j) != ' ' ) j++;
            
            String value = s.substring( i , j );
            
            if(result.length() == 0)
            {
                result.append(value);
            }else
            {
                result.insert(0,value + " ");
            }
            i = j+1;
        }
        return result.toString();
    }//     public String reverseWords(String s) {
}//