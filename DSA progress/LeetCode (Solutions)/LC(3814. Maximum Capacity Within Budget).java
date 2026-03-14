import java.util.*;

class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {

        int n = costs.length;
        int[][] arr = new int[n][2];// Create a 2D array to store costs and capacities together

        for (int i = 0; i < n; i++) {// Fill the 2D array with costs and capacities
            arr[i][0] = costs[i];// The first column of the 2D array will store the costs
            arr[i][1] = capacity[i];// The second column of the 2D array will store the capacities
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);// Sort the 2D array based on costs in ascending order
// Create a prefix maximum array to store the maximum capacity up to each index in the sorted 2D array
        int[] prefixMax = new int[n];// The prefix maximum array will store the maximum capacity up to each index in the sorted 2D array
        prefixMax[0] = arr[0][1];// The maximum capacity at index 0 is just the capacity of the first machine

        for (int i = 1; i < n; i++) {// Fill the prefix maximum array by comparing the current capacity with the maximum capacity up to the previous index
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i][1]);// The maximum capacity at index i is the maximum of the capacity of the current machine and the maximum capacity up to the previous index
        }

        int ans = 0;// Initialize the answer variable to store the maximum capacity within the budget

        // Case 1: single machine
        for (int i = 0; i < n; i++) {// Iterate through the sorted 2D array to find the maximum capacity of a single machine that is within the budget
            if (arr[i][0] < budget) {// If the cost of the machine is less than the budget, we can consider it for our answer
                ans = Math.max(ans, arr[i][1]);// Update the answer with the maximum capacity of the machine that is within the budget
            }
        }

        // Case 2: two machines
        for (int j = 1; j < n; j++) {// Iterate through the sorted 2D array starting from index 1 to find pairs of machines that are within the budget

            int remain = budget - arr[j][0] - 1;// Calculate the remaining budget after considering the cost of the current machine (arr[j][0]) and subtracting 1 to ensure we are strictly less than the budget
            if (remain < 0) continue;// If the remaining budget is negative, we cannot consider this machine, so we skip to the next iteration

            int left = 0, right = j - 1, idx = -1;// Initialize two pointers for binary search to find the maximum index of a machine that can be paired with the current machine (arr[j]) without exceeding the remaining budget

            while (left <= right) {// Perform binary search to find the maximum index of a machine that can be paired with the current machine (arr[j]) without exceeding the remaining budget
                int mid = (left + right) / 2;// Calculate the middle index for binary search

                if (arr[mid][0] <= remain) {// If the cost of the machine at index mid is less than or equal to the remaining budget, we can consider it for pairing with the current machine (arr[j])
                    idx = mid;// Update the index of the machine that can be paired with the current machine (arr[j])
                    left = mid + 1;// Move the left pointer to the right to find a machine with a higher cost that can still be paired with the current machine (arr[j])
                } else {
                    right = mid - 1;// Move the right pointer to the left to find a machine with a lower cost that can be paired with the current machine (arr[j])
                }
            }

            if (idx != -1) {
                ans = Math.max(ans, arr[j][1] + prefixMax[idx]);// If we found a valid machine to pair with the current machine (arr[j]), we update the answer with the maximum capacity of the current machine (arr[j][1]) plus the maximum capacity of the machine at index idx (prefixMax[idx]) that can be paired with it without exceeding the budget
            }
        }// After iterating through all machines and their possible pairings, we return the maximum capacity that can be achieved within the given budget

        return ans;// Return the maximum capacity that can be achieved within the given budget
    }
}