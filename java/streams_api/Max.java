import java.util.Arrays;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Max: " + max);

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int max2 = list.stream().max(Integer::compare).get();
        System.out.println("Max: " + max2);
    }
}
