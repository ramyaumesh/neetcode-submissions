class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key,k->new ArrayList<String>()).add(s);
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
