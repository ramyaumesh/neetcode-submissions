class Solution {
    public int maxProfit(int[] prices) {
        int[] prefixMax = new int[prices.length];
        prefixMax[prefixMax.length-1]=prices[prices.length-1];
        for(int i=prefixMax.length-2;i>=0;i--){
            prefixMax[i]=Math.max(prefixMax[i+1],prices[i]);
        }
        int maxProfit = Integer.MIN_VALUE;
        for(int i =0;i<prefixMax.length;i++){
            maxProfit=Math.max(prefixMax[i]-prices[i],maxProfit);
        }
        return maxProfit;
    }
}
