package Java.Leetcode;

public class numberOfSteps {

    public static int result = 0;
    public static int numberOfSteps(int num) {

        if (num == 0) {
            return result;
        } else {
            result++;
            if (num % 2 == 1) {
                numberOfSteps(num - 1);
            } else {
                numberOfSteps(num / 2);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}

