class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                int val = hashMap.get(nums[i]) + 1;
                hashMap.put(nums[i], val);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }

            for(Integer num : hashMap.values()){
                if(num > 1)
                {
                    return true;
                }
            }
                return false;
    }
}