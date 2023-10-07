class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        if(n==0||m==0 || "0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        if("1".equals(num1)){
            return num2;
        }
        if("1".equals(num2)){
            return num1;
        }
        int[] res=new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){

                int prod= (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                //first take product and add with prev num if it is already there coz of prev num multi
                //then take rem of that whole sum in res and quotient in i+j which is before (i+j+1).
                prod= prod+res[i+j+1];
                res[i+j+1] = prod%10;

                res[i+j] += prod/10;
                
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i:res){
            //discarding leading 0
            if(str.length()==0 && i==0){
                continue;
            }
            str.append(i);
        }
        return str.toString();
    }

    //              1  2  3             (num1)
    //      X       4  5  6             (num2)
	//    ==================
	// 	            1  8             (3*6)
	// 	         1  2                (2*6)
	// 	      0  6                   (1*6)
	//    ------------------
	// 	         1  5                (3*5)
	// 	      1  0                   (2*5)
	// 	   0  5                      (1*5)
	//    ------------------
	// 	      1  2                   (3*4)
	// 	   0  8                      (2*4)
	// 	0  4                         (1*4)
	//    ==================
	// 	0  5  6  0  8  8             (Result)
	//    ==================
}