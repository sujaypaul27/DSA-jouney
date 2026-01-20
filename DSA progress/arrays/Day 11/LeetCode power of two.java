class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean found =false;
       if(n<=0) return false;//if num less than 0
       return (n&(n-1))==0;//since power of 2 have only 1 bits ans using & and n-1 it is removed
    }
}