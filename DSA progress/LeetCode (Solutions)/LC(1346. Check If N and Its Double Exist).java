import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {// TC: O(n), SC: O(n)
        HashSet<Integer> set = new HashSet<>();// to store the elements of the array
        
        for (int num : arr) {// iterate through the array
            
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {// if the set contains either num*2 or num/2 (only if num is even),
                return true;// if the set contains either num*2 or num/2 (only if num is even), return true
            }
            
            set.add(num);// add the current number to the set
        }
        
        return false;// if no such pair is found, return false
    }// Time complexity: O(n) where n is the length of the input array. We iterate through the array once, and each lookup and insertion operation in the HashSet takes O(1) on average. Space complexity: O(n) in the worst case, if all elements in the array are unique, we will store all of them in the HashSet.
}//