class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int n = A.length;
        Arrays.sort(A);

        int[][] b = new int[n][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = B[i];
            b[i][1] = i;
        }

        Arrays.sort(b, (x, y) -> x[0] - y[0]);

        int low = 0, high = n - 1;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (A[high] > b[i][0]) {
                res[b[i][1]] = A[high];
                high--;
            } else {
                res[b[i][1]] = A[low];
                low++;
            }
        }

        return res;
    }
}