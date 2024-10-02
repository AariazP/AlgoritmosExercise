package preparcial1;

public class EJ20 {

    public static void main(String[] args) {
        EJ20 ej20 = new EJ20();
        int[][] matrix = new int[][]{
                {1,2,3},
                {2,7,4},
                {3,4,5}
        };
        System.out.println(ej20.isSimetric(matrix, 0, 0));

    }

    public boolean isSimetric(int[][] matriz, int i, int j){

        if(i==matriz.length) return true;
        if(j>=i||j==matriz[i].length) return isSimetric(matriz, i+1, 0);
        if(matriz[i][j]!=matriz[j][i]) return false;
        return isSimetric(matriz, i, j+1);


    }
}
