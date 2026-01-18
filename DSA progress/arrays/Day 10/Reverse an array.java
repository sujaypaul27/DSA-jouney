// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
 public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        for(int a:arr)
        {
             System.out.print(a);
            
        }
        System.out.println();
        
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
         System.out.print("Reversed  Array: ");
        for(int a:arr)
        {
             System.out.print(a);
            
        }
    }
}
