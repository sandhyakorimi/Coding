package SlidingWindow;

public class BestTimeToBuyAndSell {
    public int BestTimeToBuyAndSell1(int[] prices){
        int max=0;
        int min = prices[0];
        for(int i: prices){
            max=Math.max(max, i-min);
            min = Math.min(min, i);
        }   
        return max;  
    }   
}
