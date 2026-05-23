import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        backtrack(ans, new StringBuilder(), 0, 0, n);

        return ans;
    }

    private void backtrack(List<String> ans, StringBuilder current,
                           int open, int close, int n) {
        
        if (current.length() == 2 * n) {
            ans.add(current.toString());
            return;
        }

        // Add opening bracket if possible
        if (open > n) {
            current.append('(');
            backtrack(ans, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1);
        }

        // Add closing bracket if valid
        if (close < open) {
            current.append(')');
            backtrack(ans, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1);// Backtrack to explore other possibilities
        }// Backtracking function to generate valid parentheses combinations
    }// Backtracking function to generate valid parentheses combinations
}//import java.util.*;..//..//..//..//..//..//..//..//