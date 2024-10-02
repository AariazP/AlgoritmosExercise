package preparcial1;

import java.util.Arrays;

public class EJ12 {

    public static void main(String[] args) {
        EJ12 ej12 = new EJ12();
        System.out.println(Arrays.toString(ej12.reverseString(new String[]{"hola", "banana"}, 0)));
    }

    public String[] reverseString(String[] arr, int i){

        if(i==arr.length) return arr;
        arr[i] = new StringBuilder(arr[i]).reverse().toString();
        return reverseString(arr, i+1);

    }

}
