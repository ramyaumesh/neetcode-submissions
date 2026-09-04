class Solution {
    public int totalFruit(int[] fruits) {
        int left=0,right=0;
        HashMap<Integer,Integer> window = new HashMap<>();
       // int maxFreq = 0;
        int maxLen =0;

        while(right<fruits.length){
            window.put(fruits[right],window.getOrDefault(fruits[right],0)+1);
            while(window.size()>2){
                int curL = fruits[left];
                window.put(curL,window.get(curL)-1);
                if(window.get(curL)==0)
                    window.remove(curL);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}