package Java.CodeWars.cw8;

public class Kata8 {
    
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) { 

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
            counter++;
        }

        return yourPoints > (sum / counter);
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
    }
}
