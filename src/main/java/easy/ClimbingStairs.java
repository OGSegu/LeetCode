package easy;

public class ClimbingStairs {

    public static void main(String[] args) {
        int result = climbStairs(5);
        System.out.println("result = " + result);
    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int[] d = new int[n];
        d[0] = 1;
        d[1] = 2;
        for (int i = 2; i < n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        return d[n - 1];
    }
}
