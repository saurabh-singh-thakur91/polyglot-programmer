public class FirstElementNotSmallerThanTarget {
    public static int findFirstElementNotSmallerThanTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[high] >= target ? high : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 4, 5 };
        int target = 4;
        System.out.println(findFirstElementNotSmallerThanTarget(arr, target));
    }
}