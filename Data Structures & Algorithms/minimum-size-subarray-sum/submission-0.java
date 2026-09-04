class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int minLen =Integer.MAX_VALUE;
        int windowSum =0;
        while(right<nums.length){
            windowSum+=nums[right];
            while(windowSum>=target){
                minLen=Math.min(minLen,right-left+1);
                windowSum-=nums[left];
                left++;
            }
            right++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}