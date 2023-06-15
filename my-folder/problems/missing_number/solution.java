class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==1){
            return nums[0]==0 ? 1:0;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}