class Solution {
    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ", "");
        String answer = "";
        Map<String, String> keyMap = new HashMap<>();
        int counterCharAscii=97;
        for(int i=0; i<key.length(); i++){
            if(keyMap.get(String.valueOf(key.charAt(i)))==null){
                keyMap.put(String.valueOf(key.charAt(i)), Character.toString(counterCharAscii));
                counterCharAscii++;
            }
        }
        for(int i=0; i<message.length(); i++){
            if((message.charAt(i))==' '){
                answer += " ";
            }
            else{
                answer+= String.valueOf(keyMap.get(String.valueOf(message.charAt(i))));
            }
        }
        return answer;
        
    }
}
