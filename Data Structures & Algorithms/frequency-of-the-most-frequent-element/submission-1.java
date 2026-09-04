class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left=0,right=0;
        int windowSum = 0;
        int maxFreq = 0;
        Arrays.sort(nums);
        while(right<nums.length){
            windowSum+=nums[right];
            while(nums[right]*(right-left+1)>windowSum+k){
                windowSum-=nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq,right-left+1);
            right++;
        }
        return maxFreq;
    }
}