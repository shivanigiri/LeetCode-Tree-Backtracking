class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> freqMap= createFreqMap(nums);
        Arrays.sort(nums);
        generate(nums, new ArrayList<>(),freqMap);
        return res;
    }
    public void generate(int[] nums, ArrayList<Integer> curr, Map<Integer, Integer> freqMap){
         if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
       
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();
            if (count == 0)
                continue;
            // add this number into the current combination
            curr.add(num);
            System.out.println(curr +"count ::"+count+"map::"+entry);
            freqMap.put(num, count - 1);

            // continue the exploration
            generate(nums,curr,freqMap);

            // revert the choice for the next exploration
            curr.remove(curr.size()-1);
            freqMap.put(num, count);
            System.out.println(curr+"count"+count);
        }
    }
    public  Map<Integer, Integer> createFreqMap(int[] nums){
        Map<Integer, Integer> freqMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
            System.out.println(nums[i] +"count ::"+ freqMap.getOrDefault(nums[i],0)+1);
        }
        return freqMap;
    }
}