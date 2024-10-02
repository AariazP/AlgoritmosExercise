package preparcial1;

public class EJ11 {
    public static void main(String[] args) {
        EJ11 ej11 = new EJ11();
        int[][] matrix = new int[][]{
                {10,2,3},
                {4,5,6}
        };
        System.out.println(ej11.getMinorMatrix(matrix, 0, 0, Integer.MAX_VALUE));
    }

    public int getMinorMatrix(int[][] matrix, int i, int j, int minor){
        if(i==matrix.length) return minor;
        else if(j==matrix[0].length){
            i+=1;
            j=0;
        } else if(matrix[i][j]<minor) minor=matrix[i][j];
        return getMinorMatrix(matrix, i, j+1, minor);
    }
}
