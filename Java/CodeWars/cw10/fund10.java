package Java.CodeWars.cw10;

public class fund10 {
    public static int squareSum(int[] n) {
        int x = 0;
        for (int i = 0; i < n.length; i++) {
            x += n[i] * n[i];
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1, 2, 2}));
    }
}
