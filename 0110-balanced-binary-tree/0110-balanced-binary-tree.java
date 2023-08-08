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
    boolean res=true;
    public boolean isBalanced(TreeNode root) {
        // height Balanced= |H(left)-H(right)|<=1
        checkBalanced(root);
        return res;
    }
    public int checkBalanced(TreeNode root){
        if(root==null) return 0;
        int left= checkBalanced(root.left);
        int right= checkBalanced(root.right);
        if(Math.abs(left-right)>1){
            res= false;
        }
        return Math.max(left,right)+1;
    }
}