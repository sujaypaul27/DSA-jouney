class Solution {
    public long minimumSteps(String s) {
        long swaps = 0;
        long countOnes = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            } else {
                swaps += countOnes;
            }
        }

        return swaps;// Each '0' needs to swap with all the '1's that come before it
    }
}