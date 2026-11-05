class Solution {
    public boolean isAnagram(String s, String t) {
        int[] characters = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        else {
        int i = 0;
        
        while(i < s.length()){
            characters[s.charAt(i) - 'a']++;
            characters[t.charAt(i) - 'a']--;
            i++;
        }
            for(int l = 0; l < characters.length; l++){
                if(characters[l] != 0){
                    return false;
                }
            }
                return true;
        }
    }
}
