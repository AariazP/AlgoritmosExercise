package preparcial1;

import java.util.Arrays;

public class EJ18 {

    public static void main(String[] args) {
        EJ18 ej18 = new EJ18();
        int[][] matrix = new int[6][6];
        matrix = ej18.fillMatrix(matrix, 0, matrix.length-1, matrix.length, 0);

        for(int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }


    public int[][] fillMatrix(int[][] matrix, int i, int j, int n, int cont){
        if(i==matrix.length) return matrix;
        if(j<0) return fillMatrix(matrix, i+1, matrix.length-1, n-1, 0);
        matrix[i][j] = Math.max(cont, n);
        return fillMatrix(matrix, i, j-1, n, cont+1);
    }
}

