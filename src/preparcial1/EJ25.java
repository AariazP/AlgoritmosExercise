package preparcial1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EJ25 {

    public static void main(String[] args) {

        EJ25 ej25 = new EJ25();
        String[][] matrix = new String[][]{
                {"cama", "acma"},
                {"oso", "roso"},
                {"tela", "late"}
        };
        System.out.println(Arrays.toString(ej25.findSimils(matrix, 0, new ArrayList<>())));
    }


    public Integer[] findSimils(String[][] matrix, int i, List<Integer> list){

        if(i==matrix.length) return list.toArray(new Integer[0]);
        String otra = matrix[i][1];
        boolean aux = true;
        if(matrix[i][0].length() != otra.length()) return findSimils(matrix, i+1, list);
        for(char e: matrix[i][0].toCharArray()){

            if(otra.contains(e+"")) otra = otra.replaceFirst(e+"", "#");
            else aux = false;

        }
        if(aux) list.add(i);
        return findSimils(matrix, i+1, list);
    }
}
