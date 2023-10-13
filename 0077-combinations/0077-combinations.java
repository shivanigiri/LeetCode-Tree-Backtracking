class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        generate(res,n,k,1,new ArrayList<>());
        return res;
    }
    public void generate(List<List<Integer>> res,int n,int size,int index,ArrayList<Integer> curr){
        if(size==0){
            res.add(new ArrayList<>(curr));
            return ;
        }
        // if(index>n){
        //     return;
        // }
        // ArrayList<Integer> temp=new ArrayList<>(curr);
        // //do
        // temp.add(index);
        // generate(res,n,size-1,index+1,temp);
        // //undo
        // generate(res,n,size,index+1,curr);

        for(int i=index;i<=n-size+1;i++)  //index+1 coz i have started from 0
        {
            //do
            curr.add(i);
            generate(res,n,size-1,i+1,curr);
            //undo
            curr.remove(curr.size()-1);
        }
    }
}