class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }

    List<Map.Entry<Integer, Integer>> sortedMap = new ArrayList(hashMap.entrySet());
        sortedMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int[] kthFrequency = new int[k];
        int i = 0;
        for(Map.Entry<Integer, Integer> map : sortedMap){
            if(i < k){
                kthFrequency[i] = map.getKey();
                i++;
            }
            else {
                return kthFrequency;
            }
        }
            return kthFrequency;
    }
}
