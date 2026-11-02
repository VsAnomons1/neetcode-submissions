class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(hashMapS.containsKey(key)){
                int updateVal = hashMapS.get(key) + 1;

                hashMapS.put(key, updateVal);
            }
            else {
                hashMapS.put(key, 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char key = t.charAt(i);
            if(hashMapT.containsKey(key)){
                int updateVal = hashMapT.get(key) + 1;

                hashMapT.put(key, updateVal);
            }
            else {
                hashMapT.put(key, 1);
            }
        }
            return hashMapS.equals(hashMapT);
    }
}
