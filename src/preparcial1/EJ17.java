package preparcial1;

import java.util.Arrays;

public class EJ17 {

    public static void main(String[] args) {
        EJ17 ej17 = new EJ17();
        int[][] m1 = new int[][]{
                {3,5,7},
                {6,2,1},
                {5,3,4}
        };
        int[][] m2 = new int[][]{
                {2,5},
                {7,3},
                {4,6}
        };
        int[][] result = ej17.multiply(m1, m2);
        for(int[] row:result){
            System.out.println(Arrays.toString(row));
        }
    }
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        return multiplyRecursively(A, B, result, 0, 0, 0);
    }

    private int[][] multiplyRecursively(int[][] A, int[][] B, int[][] result, int i, int j, int k) {
        if (i == A.length) return result;
        if (j == B[0].length) return multiplyRecursively(A, B, result, i + 1, 0, 0);
        if (k == A[0].length) return multiplyRecursively(A, B, result, i, j + 1, 0);
        result[i][j] += A[i][k] * B[k][j];
        return multiplyRecursively(A, B, result, i, j, k + 1);
    }
}
