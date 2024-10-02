package preparcial1;

public class EJ7 {
    public static void main(String[] args) {

        EJ7 ej7 = new EJ7();
        System.out.println(ej7.getPairPositions(new int[]{1,2,3,4,5,6,7}, 0, ""));
    }

    public String getPairPositions(int[] arr, int i, String s){
        if(i>=arr.length) return s;
        return getPairPositions(arr, i+2, s+=arr[i]);
    }
}
