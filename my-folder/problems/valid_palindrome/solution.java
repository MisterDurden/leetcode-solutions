class Solution {
        public String[] filterCharacters(final String inputData){
        return inputData.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().split("");
    }
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        String[] list = this.filterCharacters(s);
        for(int i =0; i<(list.length)/2 ; i++){
            if(!Objects.equals(list[i], list[list.length - i -1])){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}