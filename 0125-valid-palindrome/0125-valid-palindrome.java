class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length()-1;
        for(int i=0,j=n; i<=j ;i++,j--){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             if(Character.isLetterOrDigit(s.charAt(i))){
//                 sb.append(s.charAt(i));
//             }
//         }
//         System.out.println(sb);
//         return check(sb.toString(),0,sb.length()-1);
//     }
//     public boolean check(String s,int i,int j){
//         if(i>j){
//             return true;
//         }
//         char a= Character.toLowerCase(s.charAt(i));
//         char b= Character.toLowerCase(s.charAt(j));
//         if(a!=b){
//             return false;
//         }
//         return check(s,i+1,j-1);
//     }
// }