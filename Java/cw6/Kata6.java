package Java.cw6;

public class Kata6 {
    static int[] countPositivesSumNegatives(int[] input) {
        
        int[] output = new int[2];
        int counter = 0;
        int sum = 0;

        if (input == null || input.length == 0) {
            return new int[] {};
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    counter++;
                } else if (input[i] < 0) { 
                    sum += input[i];
                }
            }
    
            if (counter != 0 || sum != 0) {
                output[0] = counter;
                output[1] = sum;
            }

            return output;
        }
         
    }




    public static void main(String[] args) {
        System.out.println(countPositivesSumNegatives(null));
    }
}
