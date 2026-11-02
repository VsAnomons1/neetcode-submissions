class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        //O(n * m)
        for(int i = 0; i < strs.length; i++){
            int[] frequency = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                 frequency[strs[i].charAt(j) - 'a']++;   
            }
            String key = Arrays.toString(frequency);
            if(anagrams.containsKey(key)){
                anagrams.get(key).add(strs[i]);
            }
            else {
                anagrams.put(key, new ArrayList<>(List.of(strs[i])));
            }
        }
            return new ArrayList<>(anagrams.values());
    }
}
