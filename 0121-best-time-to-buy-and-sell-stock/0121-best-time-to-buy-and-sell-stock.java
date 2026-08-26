class Solution {
    public int maxProfit(int[] prices) {
         int minimum=Integer.MAX_VALUE;
         int maxProfit=0;
         for(int i=0;i<prices.length;i++){
            if(minimum>prices[i]){
                minimum=prices[i];
            }
            int profit=prices[i]-minimum;
            if(profit>maxProfit){
                maxProfit=profit;
            }

        }
        return maxProfit;
    }
}