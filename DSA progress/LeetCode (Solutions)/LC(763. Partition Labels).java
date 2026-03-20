class Solution {
    public List<Integer> partitionLabels(String s) {// Function to partition the string into as many parts as possible such that each letter appears in at most one part
        int[] last = new int[26];// Array to store last occurrence of each character
        
        // Step 1: Store last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;// Update last occurrence index for each character
        }
        
        List<Integer> result = new ArrayList<>();
        
        int start = 0;// Initialize start pointer for partitions/
        int end = 0;// Initialize start and end pointers for partitions
        
        // Step 2: Traverse and form partitions
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);// Update end to the farthest last occurrence of characters seen so far
            
            if (i == end) {
                result.add(end - start + 1);// Add partition size to result
                start = i + 1;// Move to the next partition/
            }
        }
        // Step 3: Return the result
        return result;
    }
}