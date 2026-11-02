class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);
        String srtS = new String(sortedS);

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);
        String srtT = new String(sortedT);

        return srtS.equals(srtT);
    }
}
