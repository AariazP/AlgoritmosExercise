package preparcial1;

import java.util.ArrayList;
import java.util.List;

public class EJ8 {

    public static void main(String[] args) {
        EJ8 ej8 = new EJ8();
        System.out.println(ej8.getEMiddle(new String[]{"aer", "peap", "paep"}, 0, new ArrayList<>()));
    }

    public List<String> getEMiddle(String[] arr, int i, List<String> list){

        if(i==arr.length) return list;
        if(arr[i].length() %2 != 0 &&
                arr[i].charAt(arr[i].length()/2) == 'e') list.add(arr[i]);
        return getEMiddle(arr, i+1, list);
    }
}
