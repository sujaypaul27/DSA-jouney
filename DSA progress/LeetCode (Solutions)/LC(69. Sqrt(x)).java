class Solution {
    public int mySqrt(int x) {
        //method 1
        //double ans =Math.sqrt(x);
        //return (int)ans;
        if (x < 2) return x;
        
        long left = 1;
        long right = x/2;//long coz constarint says it will be more in number
        
        while(left <= right)
        {
            long mid = left + ( right - left) / 2;
            long sq=mid*mid;
            if ( sq == x )
            {
                return (int)mid;
                
            }else if( sq > x )
            {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            
        }
        return (int)right;
        
    }
}