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
// After iterating through all the gas station check if the total net gas is non-negative. If it is, we can complete the circuit starting from the index stored in 'start'. Otherwise, we return -1 to indicate that it's not possible to complete the circuit.git 
        return total >= 0 ? start : -1;// Time complexity: O(n) where n is the number of gas stations. We traverse the arrays once. Space complexity: O(1) since we are using only a constant amount of extra space for the variables.
    }// The algorithm works by keeping track of the total net gas (total) and the current tank level (tank) as we iterate through the gas stations. If at any point the tank level drops below zero, it means we cannot start from the current station, so we reset the starting point to the next station and reset the tank. Finally, if the total net gas is non-negative, we return the starting index; otherwise, we return -1 indicating that it's not possible to complete the circuit.
}