import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean unique = true;

        for (int x : arr) {
            if (set.contains(x)) {
                unique = false;
                break;
            }
            set.add(x);
        }

        if (unique)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
