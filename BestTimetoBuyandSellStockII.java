public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <2){
            return 0;
        }
        int total = 0;
        // int high = prices[0];
        // int low = prices[0];
        for(int i = 1; i < prices.length; i++){
            // if(prices[i] < prices[i-1]){
            //     total += (high - low);
            //     low = prices[i];
            //     high = prices[i];
            // }else{
            //     high = prices[i]; 
            // }
            if(prices[i]>= prices[i-1]){
                total += (prices[i]-prices[i-1]);   
            }
        }
        // if(prices[prices.length-1] >= prices[prices.length-2]){
        //     total += (high-low);
        // }
        return total;
    }
}