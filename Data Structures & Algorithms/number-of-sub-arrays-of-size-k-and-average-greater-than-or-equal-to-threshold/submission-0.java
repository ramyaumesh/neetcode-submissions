class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,right=0;
        int res = 0;
        int windowSum=0;
        while(right<arr.length){
            windowSum+=arr[right];
            if(right-left+1>k){
                while(right-left+1>k){
                windowSum-=arr[left];
                left++;
                }
            } 
            if(right-left+1==k){
                System.out.println("windowSum::"+windowSum);
                if(windowSum/k>=threshold)
                res++;
            }
            right++;
            }
        return res;
    }
}