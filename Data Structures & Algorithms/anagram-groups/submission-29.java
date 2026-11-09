class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        int[] characters = new int[26];
        for(int i = 0; i < strs.length; i++){
            characters = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                characters[strs[i].charAt(j) - 'a']++;
            }
            String frequency = Arrays.toString(characters);
            if(anagrams.containsKey(frequency)){
                anagrams.get(frequency).add(strs[i]);
            }
            else {
                anagrams.put(frequency, new ArrayList(List.of(strs[i])));
            }
        }

            return new ArrayList(anagrams.values());
    }
}
