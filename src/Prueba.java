public class Prueba {

    public static void main(String[] args) {

        switch (1){

            case 0:
                System.out.println("se ejecuta el caso 0");
            case 1:
                System.out.println("Se ejecuta el caso 1");
            case 2:
                System.out.println("se ejecuta el caso 2");
        }


    }

    static int operacion (int m, int n){
        if (n == 0){
            return m;
        }else{
            if(n == 1) {
                return m * 2;
            }else{
                if ( n % 2==0 ){
                    return operacion(m + n, n / 2);
                }else{
                    return operacion(m + n, n / 2)*m;
                }
            }
        }
    }
}
