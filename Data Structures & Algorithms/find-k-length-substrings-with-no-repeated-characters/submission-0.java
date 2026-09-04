class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
       
        int left=0,right=0;
        int res = 0;
        HashMap<Character,Integer> window = new HashMap<>();
        boolean unique=true;
        while(right<s.length()){
         char cur = s.charAt(right);
         window.put(cur,window.getOrDefault(cur,0)+1);
         if(window.get(cur)>1){
            unique=false;
         }
         while(!unique){
            char leftC = s.charAt(left);
            int val = window.get(leftC);
            window.put(leftC,window.get(leftC)-1);
            if(val==2){
                unique=true;
            }
            left++;
         }
         while(unique && right-left+1>k) {
        	 char leftC = s.charAt(left);
        	 window.put(leftC,window.get(leftC)-1);
        	 left++;
         }
         if(right-left+1==k){
            res++;
         }
         right++;
         }
        return res;
    
    }
}
