public class BestTimetoBuyAndSell2{
    public int BestTimetoBuyAndSell(int[] prices){
        int profit =0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += (prices[i]- prices[i-1]);
             }
        }
        return profit;
    }
} 

// “I iterate through the array and compare each day’s price with the previous day’s price. If today’s price 
// is higher, I add the difference to the profit. I continue this process until the end of the array, ensuring 
// that I capture all possible profits.” with O(1) space and O(n) time complexities.