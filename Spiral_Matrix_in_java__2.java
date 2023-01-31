import java.util.*;
public class Spiral_Matrix_in_java__2 {
    
    public static int[][] CreateSpiralMatrix(int n) {
      Scanner in = new Scanner(System.in);
      int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
      int count = 1;
      int T = 0;
      int B = n - 1;
      int L = 0;
      int R = n - 1;
      int dir = 0;
      
      while (T <= B && L <= R) {
        if(dir == 0){
        for (int i = L; i <= R; i++) {
          matrix[T][i] = count++;
        }
        T++;
        dir = 1;
      }
      else if(dir == 1){
        for (int i = T; i <= B; i++) {
          matrix[i][R] = count++;
        }
        R--;
        dir = 2;
      }
      else if(dir == 2){
        for (int i = R; i >= L; i--) {
          matrix[B][i] = count++;
        }
        B--;
        dir = 3;
      }else {
        for (int i = B; i >= T; i--) {
          matrix[i][L] = count++;
        }
        L++;
        dir = 0;
      }
      }
      return matrix;
    }


    public static void PrintMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
          System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
      }
    }


    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        

        int[][] ans = CreateSpiralMatrix(n);
        PrintMatrix(ans);
    }
  }