class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==2){
            return new int[]{0,1};
        }
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer complement = target-nums[i];
            if(myMap.containsKey(complement)){
                return new int[]{myMap.get(complement), i};
            }else{
                myMap.put(nums[i], i);
            }
    }
                return new int[]{};
    }
}