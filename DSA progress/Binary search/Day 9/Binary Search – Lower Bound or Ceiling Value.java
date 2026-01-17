//Code 3
//Find the First Element Greater Than or Equal to TargetThis uses Binary Search, but with a small twist.
//Problem (simple words)
//Given a sorted array and a target:Find the smallest element ≥ targetIf none exists → return -1
//Example
//Array:[1, 3, 5, 7, 9]
//Target:6
//Answer:7


import java .util.*;
class Main{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner (System.in);
       System.out.println("Enter total no.of values and enter values : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();// getting input
        }
        System.out.println("Enter the target to be searched ");
        int target =sc.nextInt();
        
        int left =0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right)// for transversing element
        {
            int mid =left+(right-left)/2; //finding mid
            if(arr[mid]>=target) //finding minimum addition condition
            {
                result=arr[mid];
                right=mid -1;// to find if any number is lower than that
            }else{
                left=mid+1;//when if condition fails it will make the left value increase to find the next possible minimum element
            }
        }
        System.out.println(result);
    }
}