class Solution {
    private void reverse (int[] nums , int left , int right)
    {
        while (left <= right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
            
           int n= nums.length;
           k = k % n;
           // Standard right rotation
           // first reverse Entire array
            //Second reverse first K elements that is k-1 as per index
            //Third reverse every else  elements that is k to n-1 as per index
           reverse(nums, 0 , n-1 );
           reverse(nums, 0  , k-1);
           reverse(nums , k , n-1);
    }//
}
