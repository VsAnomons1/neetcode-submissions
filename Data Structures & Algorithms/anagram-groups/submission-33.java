class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        int[] charFrequency = new int[26];
        for(int i = 0; i < strs.length; i++){
            charFrequency = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                charFrequency[strs[i].charAt(j) - 'a']++;
            }
            String freq = Arrays.toString(charFrequency);
            if(hashMap.containsKey(freq)){
                hashMap.get(freq).add(strs[i]);
            }
            else {
                hashMap.put(freq, new ArrayList(List.of(strs[i])));
            }
        }
            return new ArrayList(hashMap.values());
    }
}
