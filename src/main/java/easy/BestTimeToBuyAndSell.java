package easy;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int max = maxProfit(new int[]{4, 1, 5, 3, 6, 4});
        System.out.println("max = " + max);
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else if (price - minValue > profit) {
                profit = price - minValue;
            }
        }
        return profit;
    }
}
