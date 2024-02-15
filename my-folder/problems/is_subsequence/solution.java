class Solution {
    public boolean isSubsequence(String s, String t) {
         
         char[] subArray = s.toCharArray();
         int counter = 0;

         for(char c : t.toCharArray()){
             if(counter==subArray.length){
                 return true;
             }
             if(c==subArray[counter]){
                 counter++;
             }
         }
         if(counter==subArray.length){
             return true;
         }else{
             return false;
         }
    }
}