class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;// initialize a variable to count the number of zeros in the array

        // Count zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;// if the current element is zero, increment the count of zeros
        }

        int i = n - 1;
        int j = n + zeros - 1;

        // Traverse from the end
        while (i < j) {
            if (j < n) {
                arr[j] = arr[i];// if the index j is within the bounds of the array, copy the element at index i to index j
            }

            if (arr[i] == 0) {
                j--;// if the element at index i is zero, we need to duplicate it, so we decrement j to create space for the duplicate zero
                if (j < n) {
                    arr[j] = 0;// if the index j is within the bounds of the array, set the element at index j to zero to duplicate the zero
                }
            }

            i--;// move the pointer i to the left to process the next element
            j--;// move both pointers to the left to continue processing the next element
        }
    }
}