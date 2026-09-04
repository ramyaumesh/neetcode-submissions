class Solution {
    Integer[][] mem;
    int[] prices; //we need an Integer array here so that initial values are assigned to null and not 0(as is the case for int[])
   // state 0 = can buy
   //state 1 = can sell
    public int maxProfit(int[] prices) {
        this.prices = prices;
        int n = prices.length;
        mem = new Integer[n][2];
       return findMaxProfit(0,0); 
    }

    private int findMaxProfit(int day,int state){
        if(day>=prices.length) return 0;
        if(mem[day][state]!=null){
                return mem[day][state];
            } 
            int profit = 0;
        if(state==0){ //buying or cooldown are the two options
               int cooldown=findMaxProfit(day+1,0);
               int buy = findMaxProfit(day+1,1) - prices[day];
               profit = Math.max(cooldown,buy);
        } else { //stock already bought. Selling or cooldown only option
            int cooldown = findMaxProfit(day+1,1);
            int sell = findMaxProfit(day+2,0)+prices[day];
           profit = Math.max(cooldown,sell);
        }
        mem[day][state]=profit;
        return profit;
    }
}
