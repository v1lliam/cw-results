package Java.CodeWars.ReduceButGrow;

/*
 * 
 * Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

    [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 * 
 * 
 */

public class reduceButGrow {
    public static int grow(int[] x) {
        int m = 1;
        for (int i = 0; i < x.length; i++) {
            m *= x[i];
        }

        return m;
    }

    public static void main(String[] args) {
        System.out.println(grow(new int[] {2, 2, 2, 2, 2, 2}));
    }
}
