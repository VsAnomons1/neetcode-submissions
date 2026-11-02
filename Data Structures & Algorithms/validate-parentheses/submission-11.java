class Solution {
    public boolean isValid(String s) {
        List<Character> openings = new ArrayList<>();

        if(s.length() < 2 || s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){

            return false;
            }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                openings.add(s.charAt(i));
            }
            else {
                if(openings.size() != 0){
                    if(openings.get(openings.size() - 1) == '(' && s.charAt(i) == ')' ||
                openings.get(openings.size() - 1) == '[' && s.charAt(i) == ']' ||
                openings.get(openings.size() - 1) == '{' && s.charAt(i) == '}'){
                    openings.remove(openings.size() - 1);
                }
                else {
                    return false;
                }
                }
                else {
                    return false;
                }
                
            }
        }
            return openings.size() == 0;
    }
}
