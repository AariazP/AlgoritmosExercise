package preparcial1;

import java.util.Arrays;

public class EJ15 {

    public static void main(String[] args) {
        EJ15 ej15 = new EJ15();
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6}
        };
        int[][] matrixTras = new int[matrix[0].length][matrix.length];
        matrixTras = ej15.makeTranspose(matrix, matrixTras, 0, 0);
        for (int i=0; i<matrixTras.length; i++){
            System.out.println(Arrays.toString(matrixTras[i]));
        }
    }

    public int[][] makeTranspose(int[][] matrix, int[][] matrixTras, int i, int j){

        if(i==matrix.length) return matrixTras;
        if(j==matrix[i].length) return makeTranspose(matrix, matrixTras,i+1, 0);
        matrixTras[j][i] = matrix[i][j];
        return makeTranspose(matrix, matrixTras, i, j+1);
    }
}
