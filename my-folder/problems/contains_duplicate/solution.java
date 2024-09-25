class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbersSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(numbersSet.contains(nums[i])){
                return true;
            }else{
                numbersSet.add(nums[i]);
            }
        }
        return false;
    }
}