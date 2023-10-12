class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='A' && s.charAt(i)<='Z')
            || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
        return check(sb.toString(),0,sb.length()-1);
    }
    public boolean check(String s,int i,int j){
        if(i>j){
            return true;
        }
        char a= Character.toLowerCase(s.charAt(i));
        char b= Character.toLowerCase(s.charAt(j));
        if(a!=b){
            return false;
        }
        return check(s,i+1,j-1);
    }
}