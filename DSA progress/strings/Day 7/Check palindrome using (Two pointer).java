import java .util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String input=sc.nextLine();
        int left=0;
        int right=input.length()-1;
        while(left< right){
            char l=input.charAt(left);
            char r=input.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }else if(!Character.isLetterOrDigit(r)){
                right--;    //if it is not a number or digit it will skip
            }else{
                if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                    System.out.println("False or not a palindrome");
                    return;
                }
                left++;  //to check next character
                right--;
            }
        
           
        }
         System.out.println("True or  a palindrome");
    }
}