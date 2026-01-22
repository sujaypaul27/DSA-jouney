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
           if((arr[left]+arr[right])==target)
           {
               found =true;
               System.out.println(arr[left]+" + "+arr[right]);
               break;
           }
           left++;
           right--;
       }
       System.out.println(found);
    }
}