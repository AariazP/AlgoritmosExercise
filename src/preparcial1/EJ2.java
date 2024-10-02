package preparcial1;

import java.util.Arrays;
import java.util.Collections;

public class EJ2 {

    public static void main(String[] args) {
        EJ2 ej2 = new EJ2();
        int[] aux = ej2.sort(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(aux));

    }

    public int[] sort(int[] array){
        return sort(array, 0);
    }
    
    public int[] sort(int[] array, int i){
        
        if(array.length<2) return array;
        if(i == array.length-1) return array;
        if(array[i+1]>array[i]){
            int aux = array[i+1];
            array[i+1] = array[i];
            array[i] = aux;
            return sort(array, 0);
        }else{
            return sort(array, i+1);
        }
        
    }
}
