class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left=0,right=0;
        int maxCust = 0;
        int origSatisCust = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0)
            origSatisCust+=customers[i];
        }
        while(right<customers.length){
           if(grumpy[right]==1){
            origSatisCust+=customers[right];
           }
           if(right-left+1>minutes){
            while(right-left+1>minutes){
                if(grumpy[left]==1)
                origSatisCust-=customers[left];
                left++;
            }
           }
           if(right-left+1==minutes){
            maxCust = Math.max(maxCust,origSatisCust);
           }
           right++;

        }
        return maxCust;
    }
}