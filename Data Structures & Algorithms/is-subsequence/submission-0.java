class Solution {
    public boolean isSubsequence(String s, String t) {
                int i=0,j=0;

        
        while(i<s.length() && j<t.length()){
            while(j<t.length() && s.charAt(i)!=t.charAt(j)){
                j++;
            }
            j++;
            i++;
        }
        return i==s.length();
    }
}