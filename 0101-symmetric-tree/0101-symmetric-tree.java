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
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left!=null && root.right!=null){
            return isSame(root.left,root.right);
        }
        return false;
    }
    public boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q== null) return true;
        if(p==null || q== null) return false;
        if(p.val!=q.val){
            return false;
        }
        //since we need to chcek mirror image.
        boolean left=isSame(p.left,q.right);
        boolean right=isSame(p.right,q.left);
        return left&&right;
    }
}