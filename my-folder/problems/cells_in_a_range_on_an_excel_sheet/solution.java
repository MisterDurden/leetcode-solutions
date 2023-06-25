class Solution {
    public List<String> cellsInRange(String s) {
        String[] strArray = s.split(":");
        char[] firstPart = strArray[0].toCharArray();
        char[] secondPart = strArray[1].toCharArray();

        List<String> answer = new ArrayList<>();

        for(int i=firstPart[0] ; i<=secondPart[0] ; i++){
            for(int j=firstPart[1]; j<=secondPart[1]; j++){
                answer.add(Character.toString(i) +Character.toString(j));
            }
        }
        return answer;
    }
}