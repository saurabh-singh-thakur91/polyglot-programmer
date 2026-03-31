import java.util.*;

class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = { 5, 3, 4, 1, 2 };

        Arrays.stream(numbers).forEach(System.out::print);

        for (int i = 0; i < numbers.length; i++) {
            int curr = i;

            while (curr > 0 && numbers[curr] < numbers[curr - 1]) {
                int t = numbers[curr];
                numbers[curr] = numbers[curr - 1];
                numbers[curr - 1] = t;
                curr--;
            }
        }

        System.out.println();
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();
    }
}