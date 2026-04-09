public class MountainArray {

    public static int findPeak(int[] arr) {
        int s = 0, e = arr.length - 1, peak = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] > arr[e]) {
                peak = Math.max(peak, m);
                e = m - 1;
            } else {
                s = s + 1;
            }
        }

        return peak;
    }

    public static void main(String[] args) {
        System.out.println(findPeak(new int[] { 0, 1, 2, 1, 0 }));
        System.out.println(findPeak(new int[] { 0, 1, 2, 1 }));
        System.out.println(findPeak(new int[] { 0, 1, 2 }));
    }

}
