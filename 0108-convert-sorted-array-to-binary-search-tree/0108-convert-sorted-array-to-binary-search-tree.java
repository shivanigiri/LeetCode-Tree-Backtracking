/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int end=nums.length-1, start=0;
        if(nums.length==1) return new TreeNode(nums[0]);
       return build(nums,start,end);
    }
    public TreeNode build(int arr[],int start, int end){
        if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=build(arr,start,mid-1);
        root.right=build(arr,mid+1,end);
        return root;
    }
}