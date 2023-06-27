class Solution {
    public int[] shuffle(int[] nums, int n) {
        int firstIterator = 0;
        int secondIterator = n;
        int[] answer = new int[nums.length];
        //List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            answer[firstIterator] = (nums[i]);
            firstIterator++;
            answer[firstIterator]= nums[secondIterator];
            firstIterator++;
            secondIterator++;
        }
        return answer;
    }
}