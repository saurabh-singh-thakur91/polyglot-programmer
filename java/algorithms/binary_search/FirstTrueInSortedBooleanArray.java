public class FirstTrueInSortedBooleanArray {

    /*
     * We could either keep the element in the range or
     * record it and then discard it
     */
    public static int findFirstTrue(boolean[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == true) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return arr[high] == true ? high : -1;
    }

    public static int findFirstByRecordAndDiscard(boolean[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == true) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] arr = { false, false, false, true, true, true };
        System.out.println(findFirstTrue(arr));

        System.out.println(findFirstByRecordAndDiscard(arr));
    }
}