package Java.Leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FizzBuzz {

    // public static void main(String[] args) {
        
    //     List<String> list = new ArrayList<>(fizzBuzz(16));
    //     Iterator iterator = list.iterator();
    //     while (iterator.hasNext()) {
    //         System.out.println(iterator.next());
    //     }
    // }

    public static List<String> fizzBuzz(int n) {
        
        List<String> list = new ArrayList<>();
        int counter = 1;

        for (int i = 0; i < n - 1; i++) {
            String str1 = Integer.toString(counter);
            if (counter % 3 == 0 && counter % 5 == 0) {
                list.add("FizzBuzz");
            }else if (counter % 5 == 0) {
                list.add("Buzz");
            } else if (counter % 3 == 0) {
                list.add("Fizz");
            } else { 
                list.add(str1);
            }

            counter++;     
        }
        
        return  list;
    }


}
