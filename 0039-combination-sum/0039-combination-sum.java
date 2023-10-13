class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        generate(res,candidates,target,0,0,new ArrayList<>());
        return res;
    }
    public void generate(List<List<Integer>> res,int[] nums,int target,int sum,int index,ArrayList<Integer> curr){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return ;
        }
        if(index>=nums.length || sum>target){
            return;
        }
        ArrayList<Integer> temp=new ArrayList<>(curr);
        //do
        temp.add(nums[index]);
        generate(res,nums,target,sum+nums[index],index,temp);
        //undo
        generate(res,nums,target,sum,index+1,curr);
        
    }
}