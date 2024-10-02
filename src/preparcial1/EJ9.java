package preparcial1;

import java.util.HashMap;
import java.util.Map;

public class EJ9 {

    public static void main(String[] args) {
        EJ9 ej9 = new EJ9();
        System.out.println(ej9.countAVG(new double[]{3.2, 4.5, 5.6, 6.2, 3.2}));
    }

    public Map<String, Integer> countAVG(double[] arr){
        double avg = getAVG(arr, 0, 0);
        Map<String, Integer> map = new HashMap<>();
        map.put("mayores", 0);
        map.put("menores", 0);
        map.put("iguales", 0);
        return countOverAVG(arr, 0, avg,map);
    }

    public double getAVG(double[] arr, int i, double sum){

        if(i==arr.length) return sum/arr.length;
        return getAVG(arr, i+1, sum+arr[i]);
    }

    public Map<String, Integer> countOverAVG(double[] arr, int i, double avg, Map<String, Integer> map){
        if(i== arr.length) return map;
        if(arr[i]>avg) map.put("mayores", map.get("mayores")+1);
        else if(arr[i]<avg) map.put("menores", map.get("menores")+1);
        else map.put("iguales", map.get("iguales")+1);
        return countOverAVG(arr, i+1, avg, map);
    }
}
