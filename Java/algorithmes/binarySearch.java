package Java.algorithmes;

public class binarySearch {
    public static int name(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            } 
            if (guess > item) {
                high = mid - 1;
            } else { 
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(name(new int[] {1, 3, 5, 6, 7}, 6));
    }
}
