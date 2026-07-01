class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<> ();
        if (nums.length == 0 ) return 0;
        for (int num : nums)
        {
            set.add(num);
        }
        int longest = 0;
        for( int num : set)// for loop use pani normal array ve travel panama yen set la travel panurom na TLE varuthu so reperated elements ku thirupui calculate panuthu . so set la transverse pananum
        {
            int currentCount = 0;
            if(!set.contains(num -1 ))
            {
                int number = num;
                while(set.contains(number ))
                {
                    number++;
                    currentCount++;
                    
                }
                longest = Math.max(longest,currentCount);
            }
        }
        return longest ;
    }
}