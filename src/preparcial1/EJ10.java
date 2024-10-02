package preparcial1;

public class EJ10 {

    public static void main(String[] args) {
        EJ10 ej10 = new EJ10();
        int[][] matrix = new int[][]{
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        System.out.println(ej10.avgDiagonally(matrix, 0, matrix.length-1, 0));
    }

    public double avgDiagonally(int[][] matrix, int i, int j, int suma){
        if(j<0) return (double) suma/matrix.length;
        suma+=matrix[i][j];
        return avgDiagonally(matrix, i+1, j-1, suma);
    }
}
