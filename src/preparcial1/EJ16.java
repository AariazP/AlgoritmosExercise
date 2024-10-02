package preparcial1;

import java.util.Arrays;

public class EJ16 {


    public static void main(String[] args) {
        EJ16 ej16 = new EJ16();
        int[][] matrix = new int[6][6];
        matrix = ej16.fillMatriz(matrix, matrix.length-1, 0, 1, 0);
        for(int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] fillMatriz(int[][] matriz, int i, int j, int count, int aux){

      if(i<0) return matriz;
      if(j== matriz.length) return fillMatriz(matriz,i-1, aux+1, 1, aux+1);
      matriz[i][j] = count;
      return fillMatriz(matriz, i, j+1, count+1, aux);
    }
}
