class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
	       Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                int val = map.get(nums[i]);
	                val++;
	                map.put(nums[i],val);
	            } else {
	                map.put(nums[i],1);
	            }
	        }
	        List<List<Integer>> bucketList = new ArrayList<>(nums.length+1);
	        for (int i = 0; i <= nums.length; i++) {
	            bucketList.add(null);
	        }
	        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
	            int key = entry.getKey();
	            int val = entry.getValue();
	            if(bucketList.get(val)==null){
	                List<Integer> list = new ArrayList<>();
	                list.add(key);
	               bucketList.set(val, list);
	            } else {
	            	bucketList.get(val).add(key);
	            }
	        }
	        int n = bucketList.size();
	        int[] res = new int[k];
	        int count = 0;
	       while(count<k){
	            List<Integer> resList = bucketList.get(n-1);
	            if(resList!=null){
	            for(int num : resList){
	                res[count]=num;
	                count++;
	                if(count==k)break;
	            }
	            } 
	            n--;
	        }
	        return res;
	    
    }
}
