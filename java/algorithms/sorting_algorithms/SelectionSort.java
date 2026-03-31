import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 4, 1, 2, 6, 9, 8, 7, 0 };

        Arrays.stream(numbers).forEach(System.out::print);

        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int t = numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i] = t;
            }
        }

        System.out.println();
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();
    }
}
