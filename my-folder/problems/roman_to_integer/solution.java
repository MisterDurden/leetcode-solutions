class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result = 0;
        char[] charArray = s.toCharArray();
        for(int i=charArray.length-1; i>-1; i--){
            if(i!=0 && romanMap.get(charArray[i])>romanMap.get(charArray[i-1])){
                result = result + (romanMap.get(charArray[i]) - romanMap.get(charArray[i-1]));
                i--;
                continue;
            }
                result = result + romanMap.get(charArray[i]);
        }
        return result;
    }
}