package Java.CodeWars.cw1;

public class Summation {
    public static int summation(int n) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            counter =+ i; 
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}
