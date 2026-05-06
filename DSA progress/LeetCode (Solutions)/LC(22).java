class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        
        int n1=nums1.length;
        
        
        int n2=nums2.length;
        for(int i=1;i<n1;i++)
        {
            for(int j =0;j<n2;j++){
            if(nums1[i]==nums2[j])
            {
               set.add(nums1[i]); 
            }
            
            }
        }
        int i = 0;
        int[] res = new int[set.size()];
        for(int num : set) {
            res[i++] = num;//   
        }
        
        return res;//returning the result array
}// Time complexity: O(n1 * n2) due to the nested loops comparing each element of nums1 with each element of nums2. Space complexity: O(min(n1, n2)) for the HashSet storing the unique intersection elements, where n1 and n2 are the lengths of nums1 and nums2 respectively.
}// Time complexity: O(n1 * n2) due to the nested loops comparing each element of nums1 with each element of nums2. Space complexity: O(min(n1, n2)) for the HashSet storing the unique intersection elements, where n1 and n2 are the lengths of nums1 and nums2 respectively.