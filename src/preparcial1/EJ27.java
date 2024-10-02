package preparcial1;

public class EJ27 {

    public static void main(String[] args) {
        EJ27 ej27 = new EJ27();
        float[] arr = new float[]{1,2,3,4,25, 7,80};
        System.out.println(ej27.findMax(arr, 0, arr.length-1));
    }


    float findMax(float[] arr, int indexA, int indexB){

        if (indexA == indexB) return arr[indexA];

        int mid = (indexA + indexB) / 2;
        float max1 = findMax(arr, indexA, mid);
        float max2 = findMax(arr, mid+1, indexB);

        return Math.max(max1, max2);

    }
}
