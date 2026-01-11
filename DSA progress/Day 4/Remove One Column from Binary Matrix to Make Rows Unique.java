import java.util.*;
class Main{
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Start");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean possible =false;
        
        for(int col =0;col<n;col++){
                HashSet<String> set=new HashSet<>();
                boolean unique =true;
                for(int rows=0;rows<m;rows++){
                    StringBuilder sb =new StringBuilder ();
                    for(int newcols=0;newcols<n;newcols++){
                        if(newcols !=col){
                            sb.append(arr[rows][newcols]);
                        }
                    }
                    if(set.contains(sb.toString())){
                        unique=false;
                        break;
                        }
                        set.add(sb.toString());
            
        }if(unique){
           possible=true;
           break;
        }
        
        
    }
    if(possible){
            System.out.print("yes");
        }
        else if(!possible){
            System.out.print("no");
        }
}
    
}