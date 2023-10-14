class Solution {
    public int maxLength(List<String> arr) {
        return generate(arr,0,new StringBuilder());
    }
    public int generate(List<String> arr,int index, StringBuilder sb){
        if(index>=arr.size()){
            if(isValid(sb)){
                return sb.length();
            }
            return 0;
        }

        StringBuilder temp=new StringBuilder(sb);
        temp.append(arr.get(index));
        int take=generate(arr,index+1,temp);

        int notTake=generate(arr,index+1,sb);

        return Math.max(take,notTake);
    }
     public boolean isValid(StringBuilder s){
         HashSet<Character> freqSet= new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(freqSet.contains(s.charAt(i))){
                return false;
            }
            freqSet.add(s.charAt(i));
        }
        return true;
    }
}