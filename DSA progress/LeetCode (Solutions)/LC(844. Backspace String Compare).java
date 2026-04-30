public class LC(844. Backspace String Compare) {
    
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {

            // Process string s
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            // Process string t
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            // Compare characters
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) return false;
            } else {
                // If one string finished but other didn't
                if (i >= 0 || j >= 0) return false;
            }

            i--;
            j--;
        }

        return true;// If we exit the loop without returning false, it means the strings are equal after processing backspaces
    }// Time complexity: O(N + M), where N and M are the lengths of strings s and t respectively. We traverse both strings once. The space complexity is O(1) since we are using only a constant amount of extra space for the pointers and counters.
}