import java.util.*;

public class MergeSort {

    public static void mergeSort(int[] numbers, int s, int e) {
        int m = s + (e - s) / 2;
        if (s >= e)
            return;
        mergeSort(numbers, s, m);
        mergeSort(numbers, m + 1, e);
        merge(numbers, s, m, e);
    }

    public static void merge(int[] numbers, int s, int m, int e) {
        int l1 = m - s + 1;
        int l2 = e - m;

        int[] a1 = new int[l1];
        int[] a2 = new int[l2];

        for (int i = 0; i < l1; i++) {
            a1[i] = numbers[i + s];
        }

        for (int i = 0; i < l2; i++) {
            a2[i] = numbers[i + m + 1];
        }

        Arrays.stream(a1).forEach(System.out::print);
        System.out.println();
        Arrays.stream(a2).forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 4, 3, 2, 1 };
        mergeSort(numbers, 0, numbers.length - 1);
    }
}
