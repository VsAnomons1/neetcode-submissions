class Solution {
    public boolean isAnagram(String s, String t) {
    int[] frequencyOfLetters = new int[26];

    if(s.length() != t.length()){
        return false;
    }
    else {
        for(int i = 0; i < s.length(); i++){
            frequencyOfLetters[(s.charAt(i) - 'a')]++;
            frequencyOfLetters[(t.charAt(i) - 'a')]--;
        }

        for(int i = 0; i < frequencyOfLetters.length; i++){
            if(frequencyOfLetters[i] != 0){
                return false;
            }
        }
            return true;
    }
    }
}
