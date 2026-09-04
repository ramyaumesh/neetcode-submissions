class Solution {
    public int maxProfit(int[] prices) {
        boolean bought = false;
        int maxProfit =0;
        int curBuy = 0;
        if(prices[0]<=prices[1]){
            curBuy = prices[0];
            bought=true;
        }
        for(int i=1;i<prices.length-1;i++){
            if(!bought&& prices[i]<=prices[i-1]&& prices[i]<=prices[i+1]){
                 curBuy = prices[i];
                bought=true;
            } else if(bought && prices[i]>=prices[i-1]&& prices[i]>=prices[i+1] ){
                maxProfit+=prices[i]-curBuy;
                bought=false;
                curBuy=0;
            }
        }
        if(bought && prices[prices.length-1]>prices[prices.length-2]){
             maxProfit+=prices[prices.length-1]-curBuy;
        }
            return maxProfit;
        }
    }
