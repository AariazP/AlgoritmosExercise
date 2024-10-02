package preparcial1;

public class EJ3 {

    public static void main(String[] args) {
        EJ3 ej3 = new EJ3();
        System.out.println(ej3.isPerfect(28));
    }

    public boolean isPerfect(int n){
        return isPerfect(n, 1, 0);
    }

    public boolean isPerfect(int n, int i, int suma){

        if(i==n) return suma == n;
        if(n%i==0) suma += i;
        return isPerfect(n, i+1, suma);

    }
}
