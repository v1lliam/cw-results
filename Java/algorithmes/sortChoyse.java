package Java.algorithmes;

import java.util.ArrayList;

public class sortChoyse {
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallest_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallest_index = i;
            }
        }

        return smallest_index;
    }

    public static ArrayList<Integer> selectionSort(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int smallest = findSmallest(arr);
            newArr.add((smallest));
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(selectionSort(new int[]{5, 7, 1, 8, 3, 10, 6}));
    }
    
}
