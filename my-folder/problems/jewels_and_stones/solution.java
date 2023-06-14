class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        int counter = 0;
        for(char jewel : jewelsArray){
            for(char stone : stonesArray){
                if(jewel==stone){
                    counter++;
                }
            }
        }
        return counter;
    }
}