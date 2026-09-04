class Solution {
    public int characterReplacement(String s, int k) {
       int left=0,right=0;
        int maxFreq = 0;
        int maxLen=0;
        HashMap<Character,Integer> window = new HashMap<>();
        while(right<s.length()){
            char cur = s.charAt(right);
            window.put(cur,window.getOrDefault(cur,0)+1);
            int curCnt = window.get(cur);
            if(maxFreq<curCnt){
                maxFreq=curCnt;
            }
            while(right-left+1-maxFreq>k){
                char curL = s.charAt(left);
                window.put(curL,window.get(curL)-1);
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
