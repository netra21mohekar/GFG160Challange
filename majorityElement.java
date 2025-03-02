

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        HashMap<Integer,Integer> h = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int n: nums){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e :h.entrySet()){
            if(e.getValue()>nums.length/3){
                l.add(e.getKey());
            }
        }
        return l;
    }
}
