import java .util.*;
class Main{
     static int firsts(int[] input,int target){
             int left=0;
        int right=input.length -1;
        int answer=-1;
        while(left<=right){//<= because we even need to check mid element
         
         int mid =left+(right-left)/2; //this because (left+right)/2 works but in larger test case it may exceedf int max values  
         if(input[mid]==target){
             answer=mid;
             right=mid-1;//coz we might have more taget before this since first occurece it wont be in right
             
         }else if(input[mid]<target){
             left=mid+1;//because sure it wont we less than since sorted
         }else{
             right=mid-1;//other case it would be higher so we need to reduce element
         }
        }
            return answer;
        }
        
         static int last(int[] input,int target){
                 int left=0;
        int right=input.length -1;;
        int answer=-1;
        
        while(left<=right){//<= because we even need to check mid element
         
         int mid =left+(right-left)/2; //this because (left+right)/2 works but in larger test case it may exceedf int max values  
         if(input[mid]==target){
             answer=mid;
             
            left=mid+1;//coz we might have more taget before this since first occurece it wont be in right
             
         }else if(input[mid]<target){
             left=mid+1;//because sure it wont we less than since sorted
         }else{
             right=mid-1;//other case it would be higher so we need to reduce element
         }
        }
             return answer;
         }
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the tot number of values and enter the values 1 by 1 : ");
        int n=sc.nextInt();
        int[] input =new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();//getting input
        }
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();
       
        int first=firsts( input,target);
        int last =last(input,target);
        System.out.println(" Started "+target+ " at : "+first);
         System.out.println(" Ended "+target+ " at : "+last);
        
       
    }
}