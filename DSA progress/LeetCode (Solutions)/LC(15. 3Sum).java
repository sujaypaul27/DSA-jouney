class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length-1;// last index
        Arrays.sort(nums);// sort the array gor using two pointer approach
        List<List<Integer>> result=new ArrayList<>();// to store the result
        for(int i=0;i<n-1;i++)// iterate till n-1 because we need at least 3 elements to make a triplet
        {
            if(i>0 && nums[i]==nums[i-1]) continue;// skip duplicates

            int l=i+1;// left pointer
            int r=n;// right pointer
            while(l<r){
            int sum =nums[i]+nums[l]+nums[r];// calculate the sum of the triplet
            
            if(sum==0)// if the sum is zero, we found a triplet
            {
                result.add(Arrays.asList(nums[i],nums[l],nums[r]));// add the triplet to the result
                while(l<r && nums[l]==nums[l+1]) l++;// skip duplicates
                while(l<r && nums[r]==nums[r-1]) r--;// skip duplicates
                l++;// move left pointer
                r--;   // move right pointer
            }else if(sum>0)// if the sum is greater than zero, we need to decrease the sum by moving the right pointer
            {
                r--;// move right pointer
            }else{
                l++;// if the sum is less than zero, we need to increase the sum by moving the left pointer
            }
            }
        }
        return result;// return the result
    }
}