import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int min=Integer.MIN_VALUE;
        int largest=0;
        int secondlargest=0;
        System.out.println("enter total no of values amd enter them");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                secondlargest=largest;
                largest=arr[i];
            }else if(secondlargest>arr[i] && arr[i] != largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Second largest: "+ secondlargest);
    }
        
    
}