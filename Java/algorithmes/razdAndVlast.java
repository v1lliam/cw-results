package Java.algorithmes;

public class razdAndVlast {
    private static int sum(int[] arr) { 
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        return total;
    }

    private static int sumRec(int[] arr) { 
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index <= arr.length) {
                return arr.length;
            } else { 
                //index = sumRec(arr[i]);
            }
        }

        return 1;
    }

    private static int findMax(int[] arr) { 
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        return max;
    } 

    
// функции для быстрой сортировки 
    // private static int[] less(int[] arr) { 

    // }

    // private static int[] quicksort(int[] arr) { 
    //     if (arr.length < 2) {
    //         return arr;
    //     } else { 
    //         int pivot = arr[0];
    //         int[] less
    //     }

        
    // }

    public static void main(String[] args) {
            System.out.println(sum(new int[] {1, 2, 3, 4}));
            System.out.println(findMax(new int[] {7, 1, 4, 2, 6, 9, 20, 8}));
    }
}
