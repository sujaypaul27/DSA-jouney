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
}
}