class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqArr1 = new int[26];
         int[] freqArr2 = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freqArr1[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freqArr2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freqArr1[i]!=freqArr2[i]){
                return false;
            }
        }
        return true;
    }
}
