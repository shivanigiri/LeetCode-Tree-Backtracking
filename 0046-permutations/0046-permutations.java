class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       // Map<Integer, Integer> freqMap=createFreqMap(nums);
        //Arrays.sort(nums);
        create(nums, new ArrayList<>(),new HashSet<>());
        return res;
    }
    public void create(int[] nums,ArrayList<Integer> curr,HashSet<Integer> set){
         if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
           // nelow line can be replaced with map as well
           //if(curr.contains(nums[i])) 
           if(set.contains(nums[i])) continue; // element already exists, skip
           //do
            set.add(nums[i]);
            curr.add(nums[i]);
            create(nums,curr,set);
            //undo
            curr.remove(curr.size()-1);
            set.remove(nums[i]);
        }
    }
}