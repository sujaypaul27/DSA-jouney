class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return total >= 0 ? start : -1;// Time complexity: O(n) where n is the number of gas stations. We traverse the arrays once. Space complexity: O(1) since we are using only a constant amount of extra space for the variables.
    }
}