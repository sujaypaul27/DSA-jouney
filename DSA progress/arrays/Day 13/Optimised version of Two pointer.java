import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       
       int[] arr = {-10, -5, -2, 0, 3, 7, 9, 14};
       int target =4;
       int left=0;
       boolean found =false;
       int right=arr.length-1;
       while(left<=right)
       {
           int sum = arr[left]+arr[right];
           if(sum == target)
           {
               found =true;
               break;
           }
           else if(sum < target)
           {
               left++;
           }
           else
           {
               right--;
           }
           left++;
           right--;
       }
       System.out.println(found);
    }
}