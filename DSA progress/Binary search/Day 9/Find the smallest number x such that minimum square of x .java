// Code 2 (Very Simple, Confidence Builder)
//Problem:

//Find the smallest number x such that x * x >= n

//(This is basically integer square root thinking)

import java .util.*;
class Main{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int left =0;
        int right=n;
        int result=-1;
        while(left<=right)// for transversing element
        {
            int mid =left+(right-left)/1; //finding mid
            if((long)mid*mid>=n)//finding minimum square condition
            {
                result=mid;
                right=mid -1;// to find if any number is lower than that
            }else{
                left=mid+1;//when if condition fails it will make the left value increase to find the next possible minimum element
            }
        }
        System.out.println(result);
    }
}