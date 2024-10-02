package ordenamiento;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = new int[]{7, 3, 5, 1, 9, 2, 4, 6, 8, -1, 1, 0, -100};
        arr = mergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] sort(int[] arr){

        if(arr.length==1) return arr;
        int mitad =(arr.length)/2;
        int[] arr1 = sort(Arrays.copyOfRange(arr, 0, mitad));
        int[] arr2 = sort(Arrays.copyOfRange(arr, mitad, arr.length));
        return merge(arr1, arr2);
    }


    public int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];
        int i=0, j=0, pos=0;

        while (i<arr1.length && j<arr2.length) {

            if(arr1[i]<arr2[j]){
                result[pos] = arr1[i];
                i++;
            }else{
                result[pos] = arr2[j];
                j++;
            }
            pos++;
        }

        while (i<arr1.length){
            result[pos] = arr1[i];
            pos++;
            i++;
        }

        while (j<arr2.length){
            result[pos] = arr2[j];
            pos++;
            j++;
        }

        return result;
    }

}
