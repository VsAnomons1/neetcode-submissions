class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if(hashMap.containsKey(val)){
                return new int[]{hashMap.get(val), i};
            }
            else {
                hashMap.put(nums[i], i);
            }
        }
            return null;
       
    }
}
