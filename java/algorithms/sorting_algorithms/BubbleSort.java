import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 9, 7, 6, 4, 5, 2, 1, 3, 8, 0 };

        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int t = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = t;
                }
            }
        }

        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();
    }
}
