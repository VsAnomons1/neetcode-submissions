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

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i]) && (target - nums[i]) == nums[i]){
                if(hashMap.get(nums[i])[1] != -1)
                    return new int[]{hashMap.get(nums[i])[0], hashMap.get(nums[i])[1]};
            }
            else if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(nums[i])[0], hashMap.get(target - nums[i])[0]};
            }
        }
                return null;

    }
}
