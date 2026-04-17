class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int answer=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }else
            {
                right=mid-1;//if target is less than mid, we can ignore the right half
            }
           

        }
        return left;//if target is not found, left will be the position where it can be inserted
    }
}