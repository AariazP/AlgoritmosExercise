package stefa;

public class Primes {

    public static void main(String[] args) {
        int[] arr ={2,4,5,7};
        System.out.println(Primo(arr, arr.length-1, 0));
    }

    public static int Primo(int[] arr, int i, int cont) {

        if(i<0) return cont;

        int num = arr[i];
        boolean isPrime = true;
        for(int j=num-1; j>1; j--){

            if(num%j==0) isPrime=false;

        }

        if(isPrime) cont++;

        return Primo(arr, i-1, cont);

    }
}
