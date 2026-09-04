class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        int[] res = new int[k];
        for(int i: nums){
            int val = countMap.getOrDefault(i,0);
            val++;
            countMap.put(i,val);
        }
        ArrayList[] freqArr = new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            int val = entry.getValue();
            ArrayList<Integer> list = null;
            if(freqArr[val]==null){
                list = new ArrayList<>();
            } else {
                list = freqArr[val];
            }
                list.add(entry.getKey());
                freqArr[val]=list;
        }
        int count=0;
        int i = freqArr.length-1;

        while(count<k){
            ArrayList<Integer> list = freqArr[i];
            if(list==null){
                i--;
                continue;
            }
            for(int num:list){
                if(count<k){
                res[count]= num;
                count++;
                } else {
                return res;
                }
            }
            i--;
        }
            return res;
    }
    
}
