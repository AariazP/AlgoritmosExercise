package preparcial1;

import java.util.ArrayList;
import java.util.List;

public class EJ23 {

    public static void main(String[] args) {
        EJ23 ej23 = new EJ23();
        System.out.println(ej23.findFibos(List.of(200, 144)));
    }


    public List<Integer> findFibos(List<Integer> list){

        int max = list.stream().sorted().toList().getLast();
        List<Integer> fibos = getFibos(0,1, new ArrayList<>(), max);
        return compareResults(list, fibos, 0, new ArrayList<>());
    }

    private List<Integer> compareResults(List<Integer> list, List<Integer> fibos, int i, List<Integer> result) {

        if(i==list.size()) return result;
        if(fibos.contains(list.get(i))) result.add(list.get(i));
        return compareResults(list, fibos, i+1, result);
    }


    public List<Integer> getFibos(int a, int b, List<Integer> list, int max){
        if(b>max) return list;
        list.add(a+b);
        return getFibos(b, a+b, list, max);
    }
}
