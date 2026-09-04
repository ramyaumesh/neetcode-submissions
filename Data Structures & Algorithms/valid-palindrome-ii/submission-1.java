class Solution {
    public boolean validPalindrome(String s) {
		 char[] chars = s.toCharArray();
		 String cs = "";
		 for(char ch : chars) {
			 if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
				 cs+=ch;
			 }
		 }
		 if(cs.length()==0)return true;
		 int l=0,r=cs.length()-1;
		 while(l<=r) {
			 char cl = Character.toLowerCase(s.charAt(l));
			 char cr = Character.toLowerCase(s.charAt(r));
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