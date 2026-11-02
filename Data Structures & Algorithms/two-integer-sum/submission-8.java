class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, int[]> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            if(hashMap.containsKey(key)){
                 hashMap.get(key)[1] = i;
            }
            else {
                hashMap.put(nums[i], new int[]{i, -1});
            }
        }

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(hashMap.containsKey(target - current)){
                if(current == (target - current)){
                    if(hashMap.get(current)[1] != -1){
                        return new int[]{i, hashMap.get(current)[1]};
                    }
                }
                else {
                    return new int[]{i, hashMap.get(target - current)[0]};
                }
            }
        }
        return null;
    }
}
