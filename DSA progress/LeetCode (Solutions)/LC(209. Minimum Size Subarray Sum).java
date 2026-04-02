class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                ans=Math.min(ans,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;// If ans is still Integer.MAX_VALUE, it means we never found a valid subarray, so we return 0
    }
}