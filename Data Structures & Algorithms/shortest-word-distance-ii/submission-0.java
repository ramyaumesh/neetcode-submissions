class WordDistance {
    HashMap<String,ArrayList<Integer>> dict = null;
    public WordDistance(String[] wordsDict) {
        dict = new HashMap<>();
        for(int i=0;i<wordsDict.length;i++){
            String s = wordsDict[i];
            if(dict.containsKey(s)){
                dict.get(s).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                dict.put(s,list);
            }
        }
    }
    
    public int shortest(String word1, String word2) {
        ArrayList<Integer> list1 = this.dict.get(word1);
        ArrayList<Integer> list2 = this.dict.get(word2);

        int l1=0,l2=0,minDiff = Integer.MAX_VALUE;
        while(l1<list1.size()&&l2<list2.size()){
            minDiff = Math.min(minDiff,Math.abs(list1.get(l1)-list2.get(l2)));
            if(list1.get(l1)<list2.get(l2)){
                l1++;
            } else {
                l2++;
            }
        }
        return minDiff;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */
