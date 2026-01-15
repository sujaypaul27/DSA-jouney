import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean possible = false;

        for (int col = 0; col < N; col++) {
            HashSet<String> set = new HashSet<>();
            boolean unique = true;

            for (int row = 0; row < M; row++) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < N; j++) {
                    if (j != col) {
                        sb.append(matrix[row][j]);
                    }
                }

                if (set.contains(sb.toString())) {
                    unique = false;
                    break;
                }
                set.add(sb.toString());
            }

            if (unique) {
                possible = true;
                break;
            }
        }

        if (possible)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
