class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }

        for(int num : frequencyMap.keySet()){
            int freq = frequencyMap.get(num);
            if(bucket[freq]!=null){
                List<Integer> bucketValueList = bucket[freq];
                bucketValueList.add(num);
                bucket[freq] = bucketValueList;
            }else{
                List<Integer> bucketValueList = new ArrayList<>();
                bucketValueList.add(num);
                bucket[freq] = bucketValueList;
            }
        }
        int[] result = new int[k];
        int counter = 0;
        for(int i=bucket.length-1; i>=0 && counter<k; i--){
            if(bucket[i] !=null){
                for(int num : bucket[i]){
                    result[counter] = num;
                    counter++;
                }
            }
        }
        return result;
    }
}