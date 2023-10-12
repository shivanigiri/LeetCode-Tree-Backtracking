class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        generate(res,nums,0,new ArrayList<>());
        return res;
    }
    public void generate(List<List<Integer>> res,int[] nums,int index, ArrayList<Integer> curr ){
        if(index==nums.length){
            res.add(curr);
            return;
        }
        ArrayList<Integer> temp= new ArrayList<>(curr);
        //do
        temp.add(nums[index]);
        generate(res,nums,index+1,temp);
        //undo
        generate(res,nums,index+1,curr);
    }
}