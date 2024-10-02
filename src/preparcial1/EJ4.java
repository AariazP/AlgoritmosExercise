package preparcial1;

public class EJ4 {

    public static void main(String[] args) {
        EJ4 ej4 = new EJ4();
        System.out.println(ej4.getNorma(new int[]{3,4}, 0, 0));
    }


    public double getNorma(int[] arr, int i, int suma){

        if(i==arr.length) return Math.sqrt(suma);
        suma += arr[i]*arr[i];
        return getNorma(arr, i+1, suma);

    }
}
