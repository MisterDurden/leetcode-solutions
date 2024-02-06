class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length<=1){
            return List.of((Arrays.asList(strs)));
        }
        Map<String, List<String>> resultMap = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            for(char c : str.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder frequencyString = new StringBuilder();
            char c = 'a';
            for(int i : freq){
                frequencyString.append(c);
                frequencyString.append(i);
                c++;
            }
            String keyResult = frequencyString.toString();
            if(resultMap.containsKey(keyResult)){
                List<String> value = resultMap.get(keyResult);
                value.add(str);
                resultMap.put(keyResult, value);
            }else{
                List<String> resultList = new ArrayList<>();
                resultList.add(str);
                resultMap.put(keyResult, resultList);
            }
        }

        return new ArrayList<>(resultMap.values());
        
    }
}