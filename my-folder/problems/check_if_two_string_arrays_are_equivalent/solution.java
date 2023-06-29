class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String con1 = "";
        String con2 = "";
        for(String word : word1){
            con1 = con1+word;
        }
        for(String word:word2){
            con2 = con2+word;
        }
        return con1.equals(con2);
    }
}