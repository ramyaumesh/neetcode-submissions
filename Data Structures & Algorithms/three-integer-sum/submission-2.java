class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
       
        for(int i=0;i<nums.length-2;i++){
            int prevj=Integer.MIN_VALUE;
       int prevk=Integer.MAX_VALUE;
           if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
            	if(j>1&&nums[j]==prevj) {
            		j++;
            		continue;
            	}
            	if(k<nums.length-1 && nums[k]==prevk) {
            		k--;
            		continue;
            	}
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    res.add(triplet);
                    prevj=nums[j];
                    prevk=nums[k];
                    j++;
                    k--;
                } else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                } else k--;
            }
        }
        return res;
    }
}
