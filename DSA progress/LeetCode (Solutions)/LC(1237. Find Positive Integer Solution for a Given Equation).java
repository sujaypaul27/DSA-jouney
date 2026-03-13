/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        
        List<List<Integer>> result = new ArrayList<>();// Initialize two pointers
        // Start with the left pointer at the beginning and the right pointer at the end
        int x = 1;// The problem states that x and y are positive integers, so we start from 1
        int y = 1000;// The problem states that x and y are positive integers, and the maximum value for f(x, y) is 1000, so we can set the right pointer to 1000
        
        while (x <= 1000 && y >= 1) {// While the left pointer is within the valid range and the right pointer is within the valid range
            
            int value = customfunction.f(x, y);// Calculate the value of f(x, y)
            
            if (value == z) {// If the value is equal to z, we found a valid pair (x, y)
                result.add(Arrays.asList(x, y));// Add the pair to the result list
                x++;// Move the left pointer to the right to find the next pair
                y--;// Move the right pointer to the left to find the next pair
            }
            else if (value < z) {// If the value is less than z, we need to increase the value by moving the left pointer to the right
                x++;// Move the left pointer to the right to increase the value
            }
            else {// If the value is greater than z, we need to decrease the value by moving the right pointer to the left
                y--;// Move the right pointer to the left to decrease the value
            }
        }
        
        return result;// Return the list of valid pairs (x, y) that satisfy f(x, y) == z
    }
}