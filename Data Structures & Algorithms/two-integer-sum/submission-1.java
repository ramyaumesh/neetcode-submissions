class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] res = new int[2];
       HashMap<Integer,Integer> indexMap = new HashMap<>();
       for(int i=0;i<=nums.length-1;i++){
            if(indexMap.containsKey(target-nums[i])){
                res[1]=i;
                res[0]=indexMap.get(target-nums[i]);
                break;
            } else {
                indexMap.put(nums[i],i);
            }
       }
       return res;
    }
}
