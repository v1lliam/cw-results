package Java.CodeWars.cw3;

public class Paper {
    
    public static int paperWork1(int n, int m) {
        
        return (n >= 1 && m >= 1) ? n * m : 0;

    }


    public static void main(String[] args) {
        System.out.println(paperWork1(1, 38));
    }
}
