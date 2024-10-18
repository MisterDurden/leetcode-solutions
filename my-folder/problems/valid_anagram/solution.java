class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alpArray = new int[26];
        for(int i=0; i<s.length(); i++){
            alpArray[(s.charAt(i))%26]++;
        }
        for(int i=0; i<t.length(); i++){
            alpArray[t.charAt(i)%26]--;
        }
        for(int i=0; i<alpArray.length; i++){
            if(alpArray[i]!=0)
                return false;
        }
        return true;
    }
}