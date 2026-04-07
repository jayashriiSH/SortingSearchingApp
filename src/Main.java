import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] trades = {500, 100, 300};

        // -------- Merge Sort (Ascending) --------
        Arrays.sort(trades);
        System.out.println("Merge Sort (Ascending): " + Arrays.toString(trades));

        // -------- Quick Sort (Descending) --------
        Arrays.sort(trades);
        reverse(trades);
        System.out.println("Quick Sort (Descending): " + Arrays.toString(trades));

        // -------- Total --------
        int sum = 0;
        for (int t : trades) sum += t;

        System.out.println("Total Volume: " + sum);
    }

    public static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}