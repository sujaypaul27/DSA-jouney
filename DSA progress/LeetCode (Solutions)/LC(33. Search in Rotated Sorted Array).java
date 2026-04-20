class Solution {
    public int search(int[] nums, int target) {
     int n=nums.length;
     int left=0;
     int right=n-1;
     while(left<=right)
     {
        int mid = left+(right-left)/2;
        if(nums[mid]== target) return mid;
        else if (nums[left]<=nums[mid])//left part sorted
        {
            if(nums[left]<=target && nums[mid]>target)
            {
                right=mid-1;
            }else
            {
                left=mid+1;
            }
        }else//rightpartsorted
        {
            if(nums[mid] < target && target <= nums[right])
            {
                left=mid+1;
            }else{
                right =mid-1;
            }
        }
     }
     return -1;// if we reach here, it means the target is not present in the array
    }
}// Time complexity: O(log n) because we are using binary search to find the target in the rotated sorted array. The while loop runs log n times in the worst case.