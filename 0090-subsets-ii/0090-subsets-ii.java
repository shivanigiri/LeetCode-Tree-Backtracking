class Solution {
   
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        generate(res,nums,0,new ArrayList<>());
        return res;
    }
     public void generate(List<List<Integer>> res,int[] nums,int index, ArrayList<Integer> curr ){
        if(index==nums.length){
            res.add(curr);
            return;
        }
        ArrayList<Integer> temp=new ArrayList<>(curr);
        temp.add(nums[index]);
        generate(res,nums,index+1,temp);
        //remove duplicates
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        generate(res,nums,index+1,curr);
     }
}