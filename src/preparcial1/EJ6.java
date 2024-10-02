package preparcial1;

public class EJ6 {
    public static void main(String[] args) {
        EJ6 ej6 = new EJ6();
        int[] arr= {2,3,5,7};
        System.out.println(ej6.countPrimes(new int[]{2,3,5,7}, arr.length-1, 0));
    }

    public int countPrimes(int[] arr, int i, int count){
        if(i<0) return count;
        if(isPrime(arr[i], 2)) count+=1;
        return countPrimes(arr, i+1, count);
    }

    public boolean isPrime(int n, int i){
        if(i==n || n<3) return true;
        if(n%i==0) return false;
        return isPrime(n, i+1);
    }
}
