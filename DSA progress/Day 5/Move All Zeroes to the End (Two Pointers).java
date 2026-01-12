import java.util.*;
class Main{
    pubblic static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int[] values =new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();
        }
        for(int i=0;i<values.length;i++){
            if(values[i]!=0){
                values[index]=values[i];
                index++;
            }
        }
        while(index<n){
            values[index]=0;
            index++;
        }
        for(int i =0;i<n;i++){
            System.out.print(values[i]);
        }
        }
    }
}