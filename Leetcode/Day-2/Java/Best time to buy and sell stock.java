class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_ele = prices[0];

        for (int i = 0; i < prices.length; i++){
            profit = Math.max(profit, prices[i] - min_ele);
            min_ele = Math.min(min_ele, prices[i]); 
        }

        return profit;

    }
}
