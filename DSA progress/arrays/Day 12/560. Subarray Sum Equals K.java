class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m =new HashMap <>();
        m.put(0,1);
        int prefixsum=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            prefixsum +=nums[i];
            if(m.containsKey(prefixsum-k))
            {
                count+=m.get(prefixsum-k);
            }
            m.put(prefixsum,m.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}