import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int[] values =new int[n];
        int index=1;
        
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        if(n==0){
            return;
            
        }
        for(int i=1;i<n;i++){
            if(values[i]!=values[i-1]){
                values[index]=values[i];
                index++;
            }
        }
        
        for(int i =0;i<index;i++){
            System.out.print(values[i]);
        }
        }
    }
