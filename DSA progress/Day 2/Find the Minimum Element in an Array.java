import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of values amd enter them");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int m=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        System.out.println("min element"+ m);
    }
        
    
}