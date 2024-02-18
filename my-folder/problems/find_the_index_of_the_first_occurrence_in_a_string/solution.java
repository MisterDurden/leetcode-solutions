class Solution {
    public int strStr(String haystack, String needle) {
        int answer = -1;
        int secondPointer = 0;
        if(needle.length()>haystack.length()){
            return answer;
        }
        for(int i=0; i<haystack.length(); i++){
            if(secondPointer == needle.length()){
                return answer;
            }
            if(haystack.charAt(i) == needle.charAt(secondPointer)){
                if(secondPointer==0){
                answer=i;
                }
                secondPointer++;
            }else{
                if(answer!=-1){
                i=answer;
                }
                answer=-1;
                secondPointer=0;
            }
        }
        if(secondPointer!=needle.length()){
            return -1;
        }
        return answer;
    }
}