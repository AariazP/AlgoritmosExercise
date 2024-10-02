package preparcial1;

public class EJ19 {

    public static void main(String[] args) {
        EJ19 ej19 = new EJ19();
        int[][] matrix = new int[][]{
                {1,3,4,5},
                {5,7,8,9},
                {3,6,4,5},
                {1,5,6,1}
        };
        System.out.println(ej19.getSumOdd(matrix, 0, 0, 0));

    }

    public int getSumOdd(int[][] matrix, int i, int j, int sum){

        if(i==matrix.length) return sum;
        if(j==matrix[i].length) return getSumOdd(matrix, i+1, 0, sum);
        if(j%2!=0) sum+=matrix[i][j];
        return getSumOdd(matrix, i, j+1, sum);
    }

}
