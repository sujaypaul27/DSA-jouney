class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int n=nums.length;
        for(int left=0;left<n;left++)
        {
            int sum=0;
            for(int right=left;right<n;right++)
            {
                sum+=nums[right];
                ans=Math.max(ans,sum);//need to calculate max for every single sub array
            }
            
        }
        return ans;
    }
}