class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, count = 0, n = prices.length;
        int min = prices[0];
        for(int i=0; i<n; i++){
            count = prices[i] - min;
            max = Math.max(max, count);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}