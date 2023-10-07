class Solution {

    public int subarraySum(int[] nums, int k) {
        int len=nums.length;
        Map<Integer, Integer> prefMap=new HashMap<>();
        int sum=0,count=0;
        prefMap.put(0,1);
        for(int i=0;i<len;i++){
            sum+=nums[i];
            if(prefMap.containsKey(sum-k)){
                count+=prefMap.get(sum-k);
            }
            prefMap.put(sum, prefMap.getOrDefault(sum,0)+1);
        }
        return count;
    }

    // public int subarraySum(int[] nums, int k) {
    //     int len=nums.length;
    //     int sum=0,count=0;
    //     for(int i=0;i<len;i++){
    //         sum=0;
    //         for(int j=i;j<len;j++){
    //             sum+=nums[j];
    //             if(k==sum){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
}