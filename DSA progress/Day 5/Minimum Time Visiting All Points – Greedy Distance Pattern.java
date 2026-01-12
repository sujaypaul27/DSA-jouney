import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int[][] values =new int[n][2];
        for(int i=0;i<n;i++){
            values[i][0]=sc.nextInt();
            values[i][1]=sc.nextInt();
        }
        int time=0;
        for(int i=1;i<n;i++){
            int x1=values[i-1][0];
            int x2=values[i][0];
            int y1=values[i-1][1];
            int y2=values[i][1];
            int dx=Math.abs(x2-x1);
            int dy=Math.abs(y2-y1);
            time+=Math.max(dx,dy);
        
       
        }
        System.out.println(time);
    }
    
}
