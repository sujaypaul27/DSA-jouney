public class LC(53. Maximum Subarray) {
    int n=nums.length;
        int maxSum=nums[0];
        int currentSum=0;
        for(int i=0;i<n;i++)
        {
            currentSum+=nums[i];
            maxSum=Math.max(maxSum,currentSum);
            if(currentSum<0)
                currentSum=0;//if sum is negative then we can ignore that part and start from next element
        }
        return maxSum;
}
