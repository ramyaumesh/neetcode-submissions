class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        
        int left=0,right=0;
        HashMap<Character,Integer> window = new HashMap<>();
        int maxLen = 0;
        while(right<s.length()){
            char cur = s.charAt(right);
            window.put(cur,window.getOrDefault(cur, 0)+1);
            while(window.size()>2){
                char leftChar = s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);
                if(window.get(leftChar)==0) {
                	window.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    
    }
}