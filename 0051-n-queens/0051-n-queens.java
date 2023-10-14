class Solution {
     List<List<String>> res= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
      int[] col=new int[n];
        Arrays.fill(col,-1);
        nqueen(0,col,n);
        return res;
	}
    public void nqueen(int r,int[] col,int A){
        if(r==A){
            res.add(modelSolution(col));
            return;
        }
        for(int c=0;c<A;c++){
            if(isValid(r,c,col)){
                //do
                col[r]= c;
                nqueen(r+1,col,A);
                //undo
                col[r]=-1;
            }
        }
    }
    public boolean isValid(int r,int c,int[] A){
        for(int i=0;i<r;i++){
            //check for same column
            if(c==A[i]){
                return false;
            }
            //check for diagonal
            if((r-c==i-A[i] )|| (r+c==i+A[i])){
                return false;
            }
        }
        return true;
    }
    public ArrayList<String> modelSolution(int[] col){
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<col.length; i++) {
            StringBuilder curr = new StringBuilder();
            for(int j=0; j<col.length; j++) {
                if(col[i]==j) curr.append('Q');
                else curr.append('.');
            }
            ans.add(curr.toString());
        }
        return ans;
    }
}