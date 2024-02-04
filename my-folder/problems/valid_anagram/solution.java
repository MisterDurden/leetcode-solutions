class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] countArray = new int[26];

        for(final char c : s.toCharArray()){
            ++countArray[c - 'a'];
        }
        for(final char c : t.toCharArray()){
            if(countArray[c - 'a']==0){
                return false;
            }
            --countArray[c - 'a'];
        }
        return true;

}}