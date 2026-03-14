import java.util.*;

class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {

        int n = costs.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = costs[i];
            arr[i][1] = capacity[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] prefixMax = new int[n];
        prefixMax[0] = arr[0][1];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i][1]);
        }

        int ans = 0;

        // Case 1: single machine
        for (int i = 0; i < n; i++) {
            if (arr[i][0] < budget) {
                ans = Math.max(ans, arr[i][1]);
            }
        }

        // Case 2: two machines
        for (int j = 1; j < n; j++) {

            int remain = budget - arr[j][0] - 1;
            if (remain < 0) continue;

            int left = 0, right = j - 1, idx = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid][0] <= remain) {
                    idx = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (idx != -1) {
                ans = Math.max(ans, arr[j][1] + prefixMax[idx]);
            }
        }

        return ans;
    }
}