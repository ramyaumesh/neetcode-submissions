class Solution {
    public int lengthOfLongestSubstring(String s) {
                int l=0,r=0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(r<s.length()){
            char curCh = s.charAt(r);
            if(!set.contains(curCh)){
                 set.add(curCh);
                r++;
            } else {
                maxLen = Math.max(maxLen,r-l);
                while(set.contains(curCh)){
                    set.remove(s.charAt(l));
                    l++;
                }
               set.add(curCh);
               r++;
            }
           
        }
        maxLen = Math.max(maxLen,r-l);
        return maxLen;
    }
}
