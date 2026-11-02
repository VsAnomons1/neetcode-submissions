class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            if(frequency.containsKey(key)){
                int updateCount = frequency.get(key) + 1;

                frequency.put(key, updateCount);
            }
            else {
                frequency.put(key, 1);
            }
        }
        Integer[] values = frequency.values().toArray(Integer[]::new);
        Arrays.sort(values, Collections.reverseOrder());
        
        HashSet<Integer> mostFreq = new HashSet<>();
        
        for(int i = 0; i < k; i++){
            mostFreq.add(values[i]);
        }
        int[] kthMostFreq = new int[k];
        int idx = 0;
        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            if(mostFreq.contains(entry.getValue())){
                kthMostFreq[idx] = entry.getKey();
                idx++;
                if(idx == k) break;
            }
        }
            return kthMostFreq;
    }
}
