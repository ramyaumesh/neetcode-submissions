class Solution {
    public int[] replaceElements(int[] arr) {
       int[] prefix = new int[arr.length];
       prefix[arr.length-1]=-1;
       for(int i=arr.length-2;i>=0;i--){
            prefix[i]=Math.max(arr[i+1],prefix[i+1]);
       } 
       return prefix;
    }
}