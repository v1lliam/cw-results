package Java.cw12;

public class CharProblem {
    public static int howOld(final String herOld) { 

        return herOld.charAt(0) - '0';
    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }
}
