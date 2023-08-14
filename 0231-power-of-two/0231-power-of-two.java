class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==0 || n%2==1) return false;
         return isPowerOfTwo(n/2);


        // if(n==0) return false;
        // while(n%2==0){
        //     n=n/2;
        // }
        // return n==1;

        // if (n == 0) return false;
        // long x = (long) n;
        // return (x & (-x)) == x;
    }
}