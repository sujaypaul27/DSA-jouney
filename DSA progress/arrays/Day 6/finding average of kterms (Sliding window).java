import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no.of.values ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the values ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k ");
        int k =sc.nextInt();
        float maxavg=0;
        float windowavg=0;
        for(int i=0;i<k;i++){
            windowavg+=arr[i];
        }
        for(int i=k;i<n;i++){
            windowavg+=arr[i]-arr[i-k];
            maxavg=Math.max(maxavg,windowavg);
        }
        
        System.out.println(maxavg/k);
    }
}