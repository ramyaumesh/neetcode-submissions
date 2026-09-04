class Solution {
    public boolean isPalindrome(String s) {
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
			 char chl = Character.toLowerCase(cs.charAt(l));
			 char chr = Character.toLowerCase(cs.charAt(r));
			 if(chl!=chr)return false;
			 l++;
			 r--;
		 }
		 return true;
		
    }
}
