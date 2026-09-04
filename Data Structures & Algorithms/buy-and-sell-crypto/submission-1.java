class Solution {
    public int maxProfit(int[] prices) {
       int maxProf = 0;
       int buy=0;
       int sell=1;
       while(sell<prices.length){
        if(prices[buy]<prices[sell]){
            int curProf = prices[sell]-prices[buy];
            maxProf = Math.max(maxProf,curProf);
        } else {
            buy=sell;
        }
        sell++;
       }
       return maxProf;
    }
}
