package preparcial1;

public class EJ1 {
    public static void main(String[] args) {
        EJ1 ej1 = new EJ1();
        boolean res = ej1.isPow2(16, 2);
        System.out.println("res = " + res);
    }


    public boolean isPow1(int n, int b){

        if(b==n) return true;
        if(b>n) return false;
        return isPow1(n, b*b);

    }


    public boolean isPow2(int n, int b){

        if(n<1) return false;
        if(n==1) return true;
        return isPow2(n/b, b);
    }



}
