import java .util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String input=sc.nextLine();
        char[] arr=input.toCharArray();
        int left =0;
        int right=input.length()-1;
        while(left<right){
            if(!isvowel(arr[left])){
                left++;
            }else if(!isvowel(arr[right])){
                right--;
            }else{
                char temp=arr[left];
                 arr[left]=arr[right];
                arr[right]=temp;
                 left++;
            right--;
            }
          
        }
        
       System.out.print(new String(arr));
       
    }
    
     static boolean isvowel(char c){
            c=Character.toLowerCase(c);
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        }
}