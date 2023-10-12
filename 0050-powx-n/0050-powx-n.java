class Solution {
    public double myPow(double x, int n) {
        if(x==0){
            return 0;
        }
        long pow=n; //taken long so that it can handhle Integer.MIN_VALUE
        double ans=solve(x,Math.abs(pow));
        if(pow<0){
            return 1/ans;
        }
        return ans;
    }
    public double solve(double x, long n){
        if(n==0){
            return 1;
        }
        double temp= solve(x, n/2);
        temp*=temp;
        if(n%2==0){
            return temp;
        }else{
            return temp*x;
        }
    }
}