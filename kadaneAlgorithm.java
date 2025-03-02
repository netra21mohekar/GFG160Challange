

class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int maxEnding = 0;
        int res = Integer.MIN_VALUE;
        for(int n:arr){
            maxEnding = Math.max(maxEnding+n,n);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
