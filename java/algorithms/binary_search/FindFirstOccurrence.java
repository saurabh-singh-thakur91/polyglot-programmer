public class FindFirstOccurrence {

    public static int findFirstOccurrence(int[] arr, int target) {
        int l = 0, h = arr.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (target == arr[m]) {
                h = m;
            } else if (target < arr[m]) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h == arr.length - 1 && arr[h] != target ? -1 : h;
    }

    public static int findFirstOccurrenceV1(int[] arr, int target) {
        int l = 0, h = arr.length - 1, first = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (target == arr[m]) {
                first = m;
            }

            if (target <= arr[m]) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(findFirstOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 0));
        System.out.println(findFirstOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 1));
        System.out.println(findFirstOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 2));
        System.out.println(findFirstOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 3));
        System.out.println(findFirstOccurrence(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 4));

        System.out.println("==============================================================");

        System.out.println(findFirstOccurrenceV1(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 0));
        System.out.println(findFirstOccurrenceV1(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 1));
        System.out.println(findFirstOccurrenceV1(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 2));
        System.out.println(findFirstOccurrenceV1(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 3));
        System.out.println(findFirstOccurrenceV1(new int[] { 1, 2, 2, 3, 3, 3, 4 }, 4));
    }
}