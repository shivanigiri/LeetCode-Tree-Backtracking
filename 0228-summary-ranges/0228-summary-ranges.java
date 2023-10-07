class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0){
            return new ArrayList();
        }
        String arrow="->";
        List<String> res=new ArrayList<>();
        String str="";
        int flag=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                str=""+nums[i];
                continue;
            }
            if(nums[i]!=nums[i-1]+1)
            {
                if(!str.equals(""+(nums[i-1]))){
                    str=str+arrow+nums[i-1];
                }
                res.add(str);
                str=""+nums[i];
                flag=1;
            }else{
                flag=0;
            }
        }
        if(!str.equals(""+(nums[nums.length-1]))){
                str=str+arrow+nums[nums.length-1];
            }
        res.add(str);
        return res;         
    }
}