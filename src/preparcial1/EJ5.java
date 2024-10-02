package preparcial1;

public class EJ5 {

    public static void main(String[] args) {
        EJ5 ej5 = new EJ5();
        System.out.println(ej5.sumNum(new int[]{1,2,3,4,5,6,7,8,9,10}, 0, 0));
    }

    public int sumNum(int[] arr, int i, int suma){

        if(i==arr.length) return suma;
        suma+=arr[i];
        return sumNum(arr, i+1, suma);
    }
}
