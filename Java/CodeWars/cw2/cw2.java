package Java.CodeWars.cw2;

import java.util.ArrayList;

public class cw2 {
    public static int[] digitize(long n) {
        
        int input = (int) n;
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        while(input > 0){
            result.add(input%10);
            input = input/10;
        }
        
        int []dsf = new int[result.size()];
        for (int index = 0; index < dsf.length; index++) {
            dsf[index] = result.get(index).intValue();
        }

        return dsf;
    }

    public static void main(String[] args) {
        System.out.println(digitize(543));
    }
}
