

// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int result = 0;
        int i = 0;
    while(i<prices.length-1){
        while(i<prices.length-1 && prices[i]>=prices[i+1]){
            i++;
        }
        if(i==prices.length-1)break;
        int buy = prices[i];
        
        while(i<prices.length-1 && prices[i]<=prices[i+1]){
            i++;
        }
        int sell = prices[i];
        result += (sell-buy); 
        
        
    }
    return result;
    }
}
