package preparcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EJ28 {

    public static void main(String[] args) {
        EJ28 ej28 = new EJ28();
        System.out.println(ej28.toBinary(List.of(8, 16,32), 0, new ArrayList<>()));
    }

    public List<List<Integer>> toBinary(List<Integer> list, int i, List<List<Integer>> result){

        if(i==list.size()) return result;
        result.add(toBinary(list.get(i), new ArrayList<>(),new Stack<>()));
        return toBinary(list, i+1, result);
    }

    public List<Integer> toBinary(int numero, List<Integer> acum, Stack<Integer> pila ){

        if(numero<2){
            acum.add(numero);
            while (!pila.empty()) acum.add(pila.pop());
            return acum;
        }

        pila.push(numero%2);
        return toBinary(numero/2, acum, pila);
    }
}
