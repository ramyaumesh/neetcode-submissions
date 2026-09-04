class Solution {
    public int lengthOfLongestSubstring(String s) {
            int l=0,r=0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(r<s.length()){
            char curCh = s.charAt(r);
            while(set.contains(curCh)){
                char leftChar = s.charAt(l);
                set.remove(leftChar);
                l++;
            }
            set.add(curCh);
           maxLen = Math.max(maxLen,r-l+1);
           r++;
        }
        
        return maxLen;
    }
}
