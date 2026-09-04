class Solution {
    public boolean isAnagram(String s, String t) {
       int[] sCharArr = new int[26];
       int[] tCharArr = new int[26];

       for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sCharArr[ch-'a']++;
       }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            tCharArr[ch-'a']++;
       }
       for(int i=0;i<26;i++){
        if(sCharArr[i]!=tCharArr[i])
            return false;
       }
       return true;
    }
}
