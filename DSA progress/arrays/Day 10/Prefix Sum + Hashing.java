import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner (System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target k value : ");
        int target =sc.nextInt();
        HashSet<Integer> set =new HashSet<>();
        int currentsum=0;
        boolean found =false;
        
        for(int i=0;i<n;i++)
        {
            currentsum+=arr[i];
            if(currentsum==target)
            {
                found =true;
                break;
                
            }
            if(set.contains(currentsum-target))
            {
                found=true;
                break;
            }
            set.add(currentsum);
        }
        if(found)
        {
            System.out.println("  Found ");
        }
        else
        {
            System.out.println(" Not Found ");
        }
        for( int a :set){
            System.out.println(a );
        }
        
    }
}