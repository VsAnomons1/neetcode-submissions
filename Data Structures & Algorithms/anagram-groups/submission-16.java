class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String wrd : strs){
            char[] word = wrd.toCharArray();
            Arrays.sort(word);
            String sortedWrd = new String(word);

            if(hashMap.containsKey(sortedWrd)){
                hashMap.get(sortedWrd).add(wrd);
            }
            else {
                hashMap.put(sortedWrd, new ArrayList(List.of(wrd)));
            }
        }

        return new ArrayList(hashMap.values());

    }
}
