class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        else {
            for(int i = 0; i < s.length(); i++){
                if(hashMapS.containsKey(s.charAt(i))){
                    int updateVal = hashMapS.get(s.charAt(i)) + 1;
                    hashMapS.put(s.charAt(i), updateVal);
                }
                else {
                    hashMapS.put(s.charAt(i), 1);
                }

                if(hashMapT.containsKey(t.charAt(i))){
                    int updateVal = hashMapT.get(t.charAt(i)) + 1;
                    hashMapT.put(t.charAt(i), updateVal);
                }
                else {
                    hashMapT.put(t.charAt(i), 1);
                }
            }
                return hashMapS.equals(hashMapT);
        }
    }
}
