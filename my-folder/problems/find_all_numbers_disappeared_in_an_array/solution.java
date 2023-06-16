class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> myMap = new HashMap<>();
        List<Integer> answerList= new ArrayList<>();
        for(int i =1 ; i<nums.length+1; i++){
            myMap.put(i, false);
        }
        for(int i : nums){
            if(myMap.get(i)!=null){
                myMap.put(i, true);
            } 
        }

        for(int i : myMap.keySet()){
            if(myMap.get(i)==false){
                answerList.add(i);
            }
        }
        return answerList;
    }
}