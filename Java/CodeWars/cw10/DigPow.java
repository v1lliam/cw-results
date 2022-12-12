package Java.CodeWars.cw10;

public class DigPow {
	
	public static long digPow(int n, int p) {
	
        int numDigits = (int) (Math.floor(Math.log10(n))+1);                      
        int result = 0;
        int num = n;
        for (int i = p + numDigits - 1; i >= p; i--) {
          result += Math.pow(num%10, i);
          num/=10;
        }
        if (result % n == 0) {
          return result / n;
        }
        return -1;
	}
    public static void main(String[] args) {
        System.out.println(digPow(695, 2));
    }
	
}

