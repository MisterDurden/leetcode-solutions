class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String currentValue : operations){
            if(currentValue.equals("X++") || currentValue.equals("++X"))
            {
                value+=1;
            }else{
                value-=1;
            }
        }
        return value;
    }
}