class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.get(nums[i])[1] = i;
            }
            else {
                hashMap.put(nums[i], new int[]{i, -1});
            }
        }
            for(int j = 0; j < nums.length; j++){
                if(hashMap.containsKey(target - nums[j]) && target - nums[j] == nums[j]){
                    if(hashMap.get(target - nums[j])[1] != -1){
                        return new int[]{j, hashMap.get(target - nums[j])[1]};
                    }
                }
                else if(hashMap.containsKey(target - nums[j])){
                    return new int[]{j, hashMap.get(target - nums[j])[0]};
                }
            }
                return null;
    }
}
