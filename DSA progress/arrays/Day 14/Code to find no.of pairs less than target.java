import java.util.*;
class Main{
    public static void main(String [] args)
    {
        int[] arr = {-5, -2, 0, 1, 3, 7};
        int target = 2;
        Arrays.sort(arr);
        int left=0;
        int right =arr.length-1;
        
        int count =0;
        
        while(left<right)
        {
            int sum =arr[left]+arr[right];
            
            if (sum<target)
            {
               
             
                count +=(right-left);
                left++;
            }
           
            else
            {
                right--;
            }
        }
      
        System.out.println("Count is " + count);
    }
}