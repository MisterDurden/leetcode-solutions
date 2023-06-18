class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int answer = 0;
        for(int i= left; i<=right; i++){
            String str = words[i];
            if(isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() -1))){
                answer++;
            }
        }
        return answer;
    }

    boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}