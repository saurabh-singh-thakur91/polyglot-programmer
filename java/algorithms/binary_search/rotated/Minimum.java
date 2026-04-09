public class Minimum {
    public static int minimum(int[] nums) {
        int l = 0, r = nums.length - 1, min = Integer.MAX_VALUE;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;

            } else {
                // min = Math.min(min, nums[m]);
                min = nums[m];
                r = m - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimum(new int[] { 3, 4, 5, 1, 2 }));
        System.out.println(minimum(new int[] { 3, 4, 5, 0, 1, 2 }));
        System.out.println(minimum(new int[] { 3, 4, 5 }));
        System.out.println(minimum(new int[] { -1, 3, 4, 5 }));
    }
}