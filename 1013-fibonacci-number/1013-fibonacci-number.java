class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        //return fib(n-1) +  fib(n-2);

        int a=0, b=1,ans=0;
        for(int i=n;i>1;i--){
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}