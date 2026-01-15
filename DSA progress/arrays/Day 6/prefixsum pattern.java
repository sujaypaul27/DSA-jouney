import java.util.*;
class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print( " START  ");
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        int[] prefixsum=new int[input.length];
        prefixsum[0]=input[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+input[i];
        }
        for(int i=0;i<n;i++){
           System.out.print(prefixsum[i]+ " ");
        }
    }
}