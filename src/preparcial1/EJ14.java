package preparcial1;

public class EJ14 {
    public static void main(String[] args) {
        EJ14 ej14 = new EJ14();
        int[][] matrix = new int[][]{
                {1,3},
                {5,6,7,3,9},
                {2,1}
        };
        System.out.println(ej14.sumEdge(matrix, 0, 0, 0));
    }


    public int sumEdge(int[][] matriz, int i, int j, int sum){

        if(i==matriz.length) return sum;
        if(j==matriz[i].length){
            i++;
            j=0;
            return sumEdge(matriz, i, j, sum);
        }
        if(i==0 || j==0 || i==matriz.length-1 || j==matriz[i].length-1) sum+=matriz[i][j];
        return sumEdge(matriz, i, j+1, sum);
    }
}
