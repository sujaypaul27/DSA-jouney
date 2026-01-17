// Problem:

// Check if a number exists in a sorted array

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total no.of values and enter values : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();// getting input
        }
        System.out.println("Enter the target to be searched ");
        int target =sc.nextInt();
        int left=0;
        int right=arr.length-1;
        int answer =-1;//to confirm if no answer found.so 0 cant be used
        boolean found=false;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                answer=mid;
                found =true;
                break;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(found +" Taget found  at "+answer);
    }
}