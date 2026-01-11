import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       HashMap<Integer,Integer> maps =new HashMap<>();
       for(int x:arr){
           if(maps.containsKey(x)){
               maps.put(x,maps.get(x)+1);
           }else{
               maps.put(x,1);
           }
       }
       for(Map.Entry<Integer,Integer> m : maps.entrySet()){
           System.out.println(m.getKey()+ " = "+m.getValue());
       }
    }
}