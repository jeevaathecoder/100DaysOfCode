package Day5;

//121. Best Time to Buy and Sell Stock
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int i=Integer.MAX_VALUE;
        int max = 0;

        for( int j=0; j<prices.length; j++){

            if(prices[j]<i){
                i=prices[j];
            }

            else{
                int profit= prices[j]-i;
                max= Math.max(max, profit);
            }

        }


        return max;
    }
}
