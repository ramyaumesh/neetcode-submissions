class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       
        int resGoal=numSubArrs(goal,nums);
        int resGoalMinusOne=numSubArrs(goal-1,nums);
        return resGoal-resGoalMinusOne;
       
    }

    private int numSubArrs(int goal, int[] nums){
        if(goal<0) return 0;
        int left=0,right=0;
        int curSum =0;
        int res=0;
        while(right<nums.length){
            curSum+=nums[right];
            while(curSum>goal){
                curSum-=nums[left];
                left++;
            }
            res+=right-left+1;
            right++;
        }
        return res;
    }
}