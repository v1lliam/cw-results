package Java.cw2;

import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {
        
        
        long input = n;
        long output = n; 
        int counter = 0;

        while (input != 0) {
            input = input / 10;
            counter++;
        }

        if(counter == 0) {
            counter++;
        }

        int[] s = new int[counter];

        for (int i = 0; i < s.length; i++) {
            long neki = output % 10;
            output = output / 10;
            s[i] = (int) neki;
        }

        return s;
    }   
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(540)));
    }
}
