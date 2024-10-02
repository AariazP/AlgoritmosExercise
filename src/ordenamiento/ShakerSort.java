package ordenamiento;

public class ShakerSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        ShakerSort shakerSort = new ShakerSort();
        arr = shakerSort.shakerSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] shakerSort(int[] arr, int inicio, int fin){
        int i=inicio;
        int inicioAux=0, finAux=0;
        if (inicio>= fin) return arr;
        while (i<fin-1){

            if(arr[i]<arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = temp;
                inicioAux =i;
            }
            i++;
        }
        int j=fin;

        while (j>inicio){
            if(arr[j]>arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                finAux = j;
            }
            j--;
        }

        return shakerSort(arr, inicioAux, finAux);

    }

}
