class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        generate(res,n,k,0,new ArrayList<>());
        return res;
    }
    public void generate(List<List<Integer>> res,int n,int size,int index,ArrayList<Integer> curr){
        if(size==0){
            res.add(curr);
            return ;
        }
        if(index>=n){
            return;
        }
        ArrayList<Integer> temp=new ArrayList<>(curr);
        //do
        temp.add(index+1);
        generate(res,n,size-1,index+1,temp);
        //undo
        generate(res,n,size,index+1,curr);
        
    }
}