class Solution {
    public int characterReplacement(String s, int k) {
        int right=0,left=0;
        int maxLen = 0;
        int maxFreq=0;
        HashMap<Character,Integer> window = new HashMap<>();
        while(right<s.length()){
            int curCnt =1;
            char cur = s.charAt(right);
            if(window.containsKey(cur)){
                curCnt+=window.get(cur);
            }
            window.put(cur,curCnt);
            if(maxFreq<curCnt){
                maxFreq=curCnt;
            }
            while(right-left+1-maxFreq>k){
                char curL = s.charAt(left);
                window.put(curL,window.get(curL)-1);
                /*if(maxFreq>window.get(curL)){
                    maxFreq=window.get(curL);
                }*/
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
