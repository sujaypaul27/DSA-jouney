class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left <= right) {
                // Swap + invert using XOR
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;

                left++;
                right--;
            }
        }

        return image;
    }
}// Time complexity: O(n^2) because we are iterating through each element of the image once. The space complexity is O(1) because we are modifying the image in place without using any additional data structures.