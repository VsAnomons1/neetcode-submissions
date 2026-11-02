class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] wrd = strs[i].toCharArray();
            Arrays.sort(wrd);
            String key = Arrays.toString(wrd);

            if(hashMap.containsKey(key)){
                hashMap.get(key).add(strs[i]);
            }
            else {
                hashMap.put(key, new ArrayList<>(List.of(strs[i])));
            }
        }

        return new ArrayList<>(hashMap.values());
    }
}
