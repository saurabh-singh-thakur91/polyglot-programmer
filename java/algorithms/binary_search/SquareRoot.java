public class SquareRoot {

    public static int squareRoot(int n) {
        int l = 1, r = n, res = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            int s = m * m;

            if (s == n) {
                return m;
            }

            if (s < n) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        res = l - 1;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(11));
        System.out.println(squareRoot(9));
        System.out.println(squareRoot(7));
        System.out.println(squareRoot(5));
    }
}
