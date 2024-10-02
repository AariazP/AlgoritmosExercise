package preparcial1;

public class EJ13 {

    public static void main(String[] args) {

        EJ13 ej13 = new EJ13();
        String[][] s = new String[][]{
                {"a", "bc", "d"},
                {"f", "ghi", "jkl"}
        };

        System.out.println(ej13.moreLongString(s, 0, 0, ""));

    }


    public String moreLongString(String[][] matrix, int i, int j, String s){

        if(i==matrix.length) return s;
        if(j==matrix[0].length){
            i++;
            j=0;
            return moreLongString(matrix, i, j,s);
        }

        if(matrix[i][j].length()>s.length()) s=matrix[i][j];
        return moreLongString(matrix, i, j+1, s);

    }
}
