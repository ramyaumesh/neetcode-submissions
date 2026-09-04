class Solution {
    public boolean validPalindrome(String s) {
         int l=0,r=s.length()-1;
		 while(l<=r) {
			 char cl = s.charAt(l);
			 char cr = s.charAt(r);
			 if(cl!=cr) {
				 return (isPali(s,l+1,r)||isPali(s,l,r-1));
				 }
			 l++;
			 r--;
			 }
			 return true;
    }
    
    private static boolean isPali(String s,int l, int r) {
    	while(l<=r) {
    		if(s.charAt(l)!=s.charAt(r)) {
    			return false;
    		}
    		l++;r--;
    	}
    	return true;
    }
}