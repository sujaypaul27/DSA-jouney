import java .util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
         int left=0;//twopointers
        int right=n-1;//to detectlast elament in an array
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
          System.out.println(" ENTER THE TARGET SUM : ");
            int target= sc.nextInt();
       
        while(left<right)//for transversing every single element
        {
         int sum=  input[left]+input[right];
         if(sum==target){
             System.out.println("values are: "+(left+1)+" and "+(right+1 ));
             break;
         }else if(sum<target){
             left++;
         }else{
             right--;
         }
        }
    }
}