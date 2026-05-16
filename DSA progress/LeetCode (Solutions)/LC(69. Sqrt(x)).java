class Solution {
    public int mySqrt(int x) {
        //method 1
        //double ans =Math.sqrt(x);
        //return (int)ans;
        if (x < 2) return x;
        
        long left = 1;
        long right = x/2;//long coz constarint says it will be more in number
        
        while(left <= right)
        {
            long mid = left + ( right - left) / 2;
            long sq=mid*mid;
            if ( sq == x )
            {
                return (int)mid;
                
            }else if( sq > x )
            {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            
        }
        return (int)right;
        
    }////
}//import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(0, digits, new StringBuilder(), ans, map);

        return ans;
    }

    private void backtrack(int index, String digits, StringBuilder current,
                           List<String> ans, String[] map) {
        
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = map[digit];

        for (int i = 2; i < letters.length(); i++) {
            current.append(letters.charAt(i));

            backtrack(index + 1, digits, current, ans, map);

            current.deleteCharAt(current.length() - 1);
        }
    }
}//import java.util.*;