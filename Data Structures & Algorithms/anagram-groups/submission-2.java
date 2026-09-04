class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> anagramMap = new HashMap<>();
     List<List<String>> res = new ArrayList<>();
     for(int i=0;i<strs.length;i++){
        char[] cur = strs[i].toCharArray();
        Arrays.sort(cur);
        String curKey = new String(cur);
        if(anagramMap.containsKey(curKey)){
            List<String> curList = anagramMap.get(curKey);
            curList.add(strs[i]);
        } else {
            List<String> newList = new ArrayList<String>();
            newList.add(strs[i]);
            anagramMap.put(curKey,newList);
        }
     }

     for(Map.Entry<String,List<String>> entry : anagramMap.entrySet()){
        res.add(entry.getValue());
     }
     return res;
    }
}
