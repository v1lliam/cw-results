package Java.cw1;
import java.util.*;

public class cw1 {

    public static int sumSquare(int n) { 
        
        int input = n;
        final int base = 10;
        final ArrayList<Integer> result = new ArrayList<>();
        while (input != 0) {
            result.add(input%(base));
            input = input / base;
        }
        
        for (int i = 0; i < result.size(); i++) {
            int x = result.get(i);
            x = x * x;
            result.set(i, x);
        }

        Collections.reverse(result);

        StringBuilder sb = new StringBuilder();
        for (Integer results : result) {
            sb.append(results != null ? results.toString() : "");            
        }

        

        String o = sb.toString();
        int otvet;
        try { 
            otvet = Integer.parseInt(o);
        } catch (NumberFormatException e) { 
            otvet = 0;
        }
        return otvet;

    }

     public static void main(String[] args) {
        System.out.println(sumSquare(378));

     }
}

