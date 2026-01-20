class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0)// not increment number coz use value which comes when bit is reduced
        {
            if((n&1)==1){
                count++;

            }
            n=n>>>1;

        }
        return count;
    }
}