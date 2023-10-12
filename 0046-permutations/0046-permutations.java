class Solution {

    List<List<Integer>> res= new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
       // Map<Integer, Integer> freqMap=createFreqMap(nums); 
        generate(nums, new ArrayList<>(),new HashSet<>());
        return res;
    }
    public void generate(int[] nums,ArrayList<Integer> curr,HashSet<Integer> set){
         if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
       for(int i=0;i<nums.length;i++){
           if(set.contains(nums[i])){ //skip repeated element of nums
               continue;
           }
           //do
           set.add(nums[i]);
           curr.add(nums[i]);
           generate(nums,curr,set);

           //undo
           set.remove(nums[i]);
           curr.remove(curr.size()-1);
       }
    }
}