class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,right=0;
        int maxOnes=0;
        int zerosInWin = 0;
        while(right<nums.length){
            if(nums[right]==0){
                zerosInWin++;
            }
            while(zerosInWin>1){
                if(nums[left]==0){
                    zerosInWin--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes,right-left+1);
            right++;
        }
        return maxOnes;
    }
}
