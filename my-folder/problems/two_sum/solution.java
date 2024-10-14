class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==2){
            return new int[]{0, 1};
        }

        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target -nums[i];
            if(numsMap.containsKey(complement)){
                return new int[]{i, numsMap.get(complement)};
            }else{
                numsMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}