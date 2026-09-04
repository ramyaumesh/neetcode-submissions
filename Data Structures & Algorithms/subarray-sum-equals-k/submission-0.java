class Solution {
    public int subarraySum(int[] nums, int k) {
      int count = 0;
      int curSum=0;
      HashMap<Integer,Integer> prefixMap = new HashMap<>();
      prefixMap.put(0,1);
      for(int i=0;i<nums.length;i++){
        curSum = curSum+nums[i];
        if(prefixMap.containsKey(curSum-k)){
            count+=prefixMap.get(curSum-k);
        }
        int val = prefixMap.getOrDefault(curSum,0);
        val++;
        prefixMap.put(curSum,val);
      }
       return count;
    }
}