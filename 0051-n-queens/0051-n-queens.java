class Solution {
     List<List<String>> res= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[] col=new int[n];
        Arrays.fill(col,-1);
        nqueen(n,col,0);
        return res;
    }
    public void nqueen(int n, int[] col,int r){
        if(r==n){
            res.add(modelSolution(col));
            return;
        }
        for(int c=0; c<n; c++){
            if(isValid(r,c,col)){
                col[r]=c;
                nqueen(n,col,r+1);
                col[r]=-1;
            }
        }
    }
    public boolean isValid(int r, int c, int[] col){
        for(int i=0;i<r;i++){
            if(c==col[i]){
                return false;
            }
            if(( r+c == i+col[i] )||( r-c == i-col[i] )){
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
            System.out.println("curr:: "+curr.toString()+ "finish");
            ans.add(curr.toString());
        }
        return ans;
    }
    public ArrayList<String> modelSolutionsss(int[] col){
       ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<col.length; i++) {
            StringBuilder curr = new StringBuilder();
            for(int j=0;j<col.length;j++){

                if(col[i]==j){
                    curr.append('Q');
                }else{
                    curr.append('.');
                }
            }
            System.out.println("curr:: "+curr.toString()+ "finish");
            ans.add(curr.toString());
        }
        return ans;
    }
}