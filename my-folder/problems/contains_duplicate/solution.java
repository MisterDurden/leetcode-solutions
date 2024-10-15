class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<1)
            return false;
        Set<Integer> dupSet = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(dupSet.contains(nums[i]))
                return true;
            else
                dupSet.add(nums[i]);
        }
        return false;
    }
}