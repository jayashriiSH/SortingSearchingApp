import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] logs = {"accB", "accA", "accB", "accC"};
        String target = "accB";

        // -------- Linear Search --------
        int first = -1, last = -1;

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals(target)) {
                if (first == -1) first = i;
                last = i;
            }
        }

        System.out.println("Linear Search:");
        System.out.println("First: " + first + " Last: " + last);

        // -------- Binary Search --------
        Arrays.sort(logs);

        int index = Arrays.binarySearch(logs, target);

        int count = 0;
        for (String s : logs) {
            if (s.equals(target)) count++;
        }

        System.out.println("\nBinary Search:");
        System.out.println("Index: " + index + " Count: " + count);
    }
}