import java.util.*;
class Main{
    public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    int n;
    int maxfinal=Integer.MIN_VALUE;
   
    System.out.print("Enter max numbers in input");
    n=sc.nextInt();
    int[] input=new int[n];
    for(int i=0;i<n;i++){
        input[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if(input[i]>maxfinal){
            maxfinal=input[i];
        }
    }
    System.out.println(maxfinal);
    }
}