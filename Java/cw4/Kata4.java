package Java.cw4;

public class Kata4 {
    public static double find_average(int[] array) {

        double otvet = 0d;

        for (int i = 0; i < array.length; i++) {
            otvet += array[i];
        }

        return otvet / array.length;
    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1,2,3}));
    }
}
