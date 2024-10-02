package preparcial1;

import java.util.List;

public class EJ22 {


    public static void main(String[] args) {
        EJ22 ej22 = new EJ22();
        List<Integer> list = List.of(1,2,3);
        System.out.println(ej22.isMultiplo(list, 0, 0));
    }

    public boolean isMultiplo(List<Integer> list, int i, int sum){

        if(i==list.size()) return sum%list.size() == 0;
        return isMultiplo(list, i+1, sum+=list.get(i));

    }
}
