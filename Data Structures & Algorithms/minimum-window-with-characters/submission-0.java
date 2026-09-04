class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char cur = t.charAt(i);
            tMap.put(cur,tMap.getOrDefault(cur,0)+1);
        }
        int left=0,right=0;
        int needed = tMap.size();
        int formed=0;
        int minLen =Integer.MAX_VALUE;
        int start=0;
        HashMap<Character,Integer> sMap = new HashMap<>();
        while(right<s.length()){
            char curS = s.charAt(right);
           sMap.put(curS,sMap.getOrDefault(curS,0)+1);
           if(tMap.containsKey(curS)&&tMap.get(curS).intValue()==sMap.get(curS).intValue()){
            formed++;
           }
           while(formed==needed){
            if(right-left+1<minLen){
                minLen=right-left+1;
                start=left;
            }
            char curL = s.charAt(left);
            sMap.put(curL,sMap.get(curL)-1);
            if(tMap.containsKey(curL)&&tMap.get(curL)>sMap.get(curL)){
                formed--;
            }
            left++;
           }
           right++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
