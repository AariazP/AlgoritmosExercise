package preparcial1;

import java.util.Arrays;

public class EJ21 {

    public static void main(String[] args) {
        EJ21 ej21 = new EJ21();
        int[][] matrix = new int[9][10];
        matrix = ej21.fillSnake(matrix, 0, 0, 1, true);
        for (int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] fillSnake(int[][] matrix, int i, int j, int count, boolean rtl){

        if(i==matrix.length) return matrix;
        if(j==matrix[i].length) return fillSnake(matrix, i+1, j-1,count,false);
        if(j<0) return fillSnake(matrix, i+1, j+1, count, true);
        matrix[i][j] = count;
        if(rtl) return fillSnake(matrix, i, j+1, count+1, rtl);
        else return fillSnake(matrix, i, j-1, count+1, rtl);

    }

}
