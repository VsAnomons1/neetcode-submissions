class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedKey = new String(arr);
            if(anagrams.containsKey(sortedKey)){
                anagrams.get(sortedKey).add(strs[i]);
            }
            else {
                anagrams.put(sortedKey, new ArrayList<>(List.of(strs[i])));
            }
        }

        return new ArrayList<>(anagrams.values());
    }
}
