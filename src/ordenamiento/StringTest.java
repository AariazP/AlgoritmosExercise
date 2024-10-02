package ordenamiento;

import java.util.Stack;

public class StringTest {

    public static void main(String[] args) {
        StringTest s = new StringTest();
        String string = "[(6-7)/4]";
        System.out.println(s.isValid(string, string.length()-1, new Stack<String>()));
    }


    public boolean isValid(String s, int i, Stack<String> pila){

        String c = s.charAt(i)+"";
        if(i<0) return true;
        if("}])".contains(c)) pila.push(c);
        else if("{[(".contains(c)) {

            if(pila.isEmpty()) return false;
            String aux = pila.pop();

            if (c.equals("{") && aux.equals("}")) {
                // Continúa
            } else if (c.equals("(") && aux.equals(")")) {
                // Continúa
            } else if (c.equals("[") && aux.equals("]")) {
                // Continúa
            } else {
                return false;
            }
        }


        return isValid(s, i-1, pila);

    }




}
