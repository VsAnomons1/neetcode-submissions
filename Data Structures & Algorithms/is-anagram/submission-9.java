class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character, Integer> hashMapS = new HashMap<>();
         HashMap<Character, Integer> hashMapT = new HashMap<>();

         if(s.length() != t.length()){
            return false;
         }
         else {
            for(int i = 0; i < s.length(); i++){
                char keyS = s.charAt(i);
                char keyT = t.charAt(i);
                if(hashMapS.containsKey(keyS)){
                    hashMapS.put(keyS, hashMapS.get(keyS) + 1);
                }
                else {
                    hashMapS.put(keyS, 1);
                }

                if(hashMapT.containsKey(keyT)){
                    hashMapT.put(keyT, hashMapT.get(keyT) + 1);
                }
                else {
                    hashMapT.put(keyT, 1);
                }
            }
                return hashMapS.equals(hashMapT);
         }   
    }
}
