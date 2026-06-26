
class Solution {     
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap <>();
        map.put(0,1);
        int prefixSum = 0;
        int count  = 0;
        for(int i = 0; i<n ; i++)
        {
            prefixSum += nums[i];
            int diff = prefixSum-k;
            if(map.containsKey(diff))
            {
                count += map.get(diff);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return count ;
    }
 }//    



///                       Brute Force 
//class Solution {     
  //  public int subarraySum(int[] nums, int k) {
//  int n = nums.length;
 //     int count =0;
  //    for(int i=0 ; i < n ; i++){
   //     int sum =0;
    //    for(int j=i;j<n ;j++){
      //      sum+= arr[j];
    //    if(sum == k)
    //        {
    //            count ++;
    //        }
    //    }
    //  }
    //  return count ;
    //}
//}