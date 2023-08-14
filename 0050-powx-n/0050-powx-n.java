class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        return pow(x,(long)n);
    }
    public double pow(double x, long n) {
        if(n<0){
            n=(-1)*n;
            x= (1.0)/x;
        }
        double ans=1;
        while(n != 0){
            if(n%2 == 1){
                ans= ans*x;
                n=n-1;
            }
            n = n / 2;
            x = x * x;
        }
        return ans;
    }
    // double ans=1;
    //     if(n>0){
    //         while(n>0){
    //             ans*=x;
    //             n--;
    //         }
    //     }else{
    //         while(n<0){
    //             ans*=x;
    //             n++;
    //         }
    //         ans=1/ans;
    //     }
    //     return ans;
}