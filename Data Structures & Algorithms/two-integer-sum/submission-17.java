class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            if(hashMap.containsKey(key)){
                hashMap.get(key)[1] = i;
            }
            else {
                hashMap.put(key, new int[] {i, -1});
            }
        }

        for(int current = 0; current < nums.length; current++){
             
            if(hashMap.containsKey(target - nums[current])){
                if(nums[current] == target - nums[current]){
                   int nIdx = hashMap.get(nums[current])[1];
                   if(nIdx != -1){
                    return new int[] {current, nIdx};
                   }
                }
                else {
                    int nIdx = hashMap.get(target - nums[current])[0];
                    return new int[] {current, nIdx};
                }
            }
        }
            return null;
    }
}
