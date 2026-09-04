class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxLen = 0;
        HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
        while(r<s.length()){
            char cur = s.charAt(r);
           if(charMap.containsKey(cur)&&charMap.get(cur)>=l){
             l=charMap.get(cur)+1;
           
           }
           
           maxLen=Math.max(maxLen,r-l+1);
            charMap.put(cur,r);
            r++;
        }
        
        return maxLen;
    }
}
