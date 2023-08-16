public class Buy_Stocks {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0, r = 1;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int p = prices[r] - prices[l];
                max = Math.max(p, max);
            }
            // System.out.println(l+" "+r+" "+max+" ");
            else {
                l = r;
                // r++;
            }
            System.out.println(l + " " + r + " " + max + " ");
            r++;

        }
        return max;
    }
}
