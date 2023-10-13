class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
     List<List<Integer>> res= new ArrayList<>();
        generate(res,n,k,1,0,new ArrayList<>());
        return res;
    }
    public void generate(List<List<Integer>> res,int target,int size,int index,int sum,ArrayList<Integer> curr){
        if(size==0 && target==sum){
            res.add(new ArrayList<>(curr));
            return ;
        }
        if(index>9 || sum>target){
            return;
        }
        ArrayList<Integer> temp=new ArrayList<>(curr);
        temp.add(index);
        generate(res,target,size-1,index+1,sum+index,temp);

        generate(res,target,size,index+1,sum,curr);
    }
}