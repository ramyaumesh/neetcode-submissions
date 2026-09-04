class Solution {
    public int removeDuplicates(int[] nums) {
        
        int L=0, R=0;
        while(R<nums.length){
            int cnt =1;
            while(R+1 < nums.length && nums[R]==nums[R+1]){
                cnt++;
                R++;
               
            }
            for(int i = 0;i<Math.min(2,cnt);i++){
                nums[L]=nums[R];
                L++;
            }
            R++;
        }
        return L;
    }
}