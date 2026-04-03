class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return calculate(nums, k)-calculate(nums, k-1);
    }
        private int calculate(int[] nums, int k){
        int left=0;
        int n=nums.length;
        int count=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
           
            while(map.size()>k)
            {
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                {
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
        }// This function calculates the number of subarrays with at most k distinct integers. It uses a sliding window approach, where we expand the right pointer to include new elements and shrink the left pointer when we exceed k distinct integers. The count is updated by adding the number of valid subarrays that can be formed with the current right pointer.
}