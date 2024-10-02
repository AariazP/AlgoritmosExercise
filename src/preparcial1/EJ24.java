package preparcial1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EJ24 {

    public static void main(String[] args) {
        EJ24 ej24 = new EJ24();
        System.out.println(Arrays.toString(ej24.findPoli(new int[]{2016, 4233}, 0, new ArrayList<>())));
    }

    public Integer[] findPoli(int[] arr, int i, List<Integer> list){

        if(i==arr.length) return list.toArray(new Integer[0]);
        boolean aux = true;
        if(arr[i]<0)  aux=false;
        if(Integer.parseInt((arr[i]+"").substring(0,2))%2!=0) aux=false;
        if(Integer.parseInt((arr[i]+"").substring(0,3))%3!=0) aux=false;
        if(Integer.parseInt((arr[i]+"").substring(0,4))%4!=0) aux=false;
        if(aux) list.add(arr[i]);
        return findPoli(arr, i+1, list);
    }
}
