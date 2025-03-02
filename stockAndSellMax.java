

// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for(int price: prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price-minPrice);
        }
     return maxProfit;
    }
}
