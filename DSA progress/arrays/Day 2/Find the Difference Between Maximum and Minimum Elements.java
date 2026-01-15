import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int largest=0;
        int smallest=0;
        
        System.out.println("enter total no of values amd enter them");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
            largest=arr[i];
            min=arr[i];
            }else if(arr[i]<max){
                max=arr[i];
                smallest=arr[i];
            }
        }
        int result =largest-smallest;
        System.out.println("Diff is : "+ result );
    }
        
    
}