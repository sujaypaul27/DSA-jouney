class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);

            // Even numbers are impossible
            if ((val & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            int temp = val;
            int trailingOnes = 0;

            // Count trailing 1s
            while ((temp & 1) == 1) {
                trailingOnes++;
                temp >>= 1;
            }

            ans[i] = val - (1 << (trailingOnes - 1));
        }

        return ans;
    }
}
