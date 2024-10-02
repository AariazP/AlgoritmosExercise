package preparcial1;

public class EJ29 {
    public static void main(String[] args) {
        EJ29 ej29 = new EJ29();
        System.out.println(ej29.operar(7,2,0));
    }

    public int operar(int n, int m, int result){
        if(m==0) return result;
        if(m%2 != 0) result+=n;
        return operar(n*2,m/2, result);
    }
}
