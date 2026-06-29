class Solution {
    public int myAtoi(String s) {
        int n =s.length();
        int i = 0;
        int result = 0;
        int sign = 1;
        if (n == 0) return 0;
            while( i < n && s.charAt(i) == ' ') i++;

            if (i == n ) return result * sign ; // to  avoid array out of index coz  when only  [" "]  give i gets incremented then if check i which is out of index 


            if (s.charAt(i) == '-' || s.charAt(i) == '+')
            {
                sign = (s.charAt(i) == '-') ? -1 : 1 ;
                i++;
            }

            while ( i < n && (s.charAt(i) >='0' && s.charAt(i) <= '9') )
            {
                if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10  && ((s.charAt(i) - '0') >  Integer.MAX_VALUE % 10 ) ) )
                {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }


                result = result * 10 + (s.charAt(i) - '0');
                i++;
            }
            
        
        return result * sign ;
    }
}