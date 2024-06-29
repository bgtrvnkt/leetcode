package n101_best_time_to_buy_sell_stocks;

public class Solution101 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int op = 0;
        int pist;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            pist = price - min;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }
}
