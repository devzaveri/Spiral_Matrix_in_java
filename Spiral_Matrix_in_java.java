import java.util.*;

public class Spiral_Matrix_in_java {

    public static int[] CreateSpiralMatrix(int n, int m) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[n][m];
        int[] ans = new int[n * m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int T = 0;
        int B = n - 1;
        int L = 0;
        int R = m - 1;
        int dir = 0;
        
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++) {
                    ans[count++] = matrix[T][i];
                }
                T++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = T; i <= B; i++) {
                    ans[count++] = matrix[i][R];
                }
                R--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = R; i >= L; i--) {
                    ans[count++] = matrix[B][i];
                }
                B--;
                dir = 3;
            } else {
                for (int i = B; i >= T; i--) {
                    ans[count++] = matrix[i][L];
                }
                L++;
            }
        }
        return ans;
    }
    public static void PrintMatrix(int[] matrix, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] ans = CreateSpiralMatrix(n, m);
        PrintMatrix(ans, n * m);
    
    }
}
