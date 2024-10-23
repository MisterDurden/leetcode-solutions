class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int maxProfit=0;
        int leftP = 0;
        int rightP = 1;
        while(rightP<prices.length){
            if(prices[rightP]-prices[leftP]>0){
                int profit = prices[rightP]-prices[leftP];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                leftP=rightP;
            }
            rightP++;
        }
        
 

        return maxProfit;


    }
}