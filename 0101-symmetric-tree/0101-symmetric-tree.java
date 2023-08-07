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
    // public boolean isSymmetric(TreeNode root) {
    //     if(root==null || (root.left==null && root.right==null)) return true;
    //     if(root.left!=null && root.right!=null){
    //         return isSame(root.left,root.right);
    //     }
    //     return false;
    // }
    // public boolean isSame(TreeNode p, TreeNode q){
    //     if(p==null && q== null) return true;
    //     if(p==null || q== null) return false;
    //     if(p.val!=q.val){
    //         return false;
    //     }
    //     //since we need to chcek mirror image.
    //     boolean left=isSame(p.left,q.right);
    //     boolean right=isSame(p.right,q.left);
    //     return left&&right;
    // }
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return true;
        if(root.left!=null && root.right!=null){
            return isSameTree(root.left,root.right);
        }
        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null && q== null) return true;
        if(p ==null || q== null) return false;
        Queue<TreeNode> q1= new LinkedList<>();
        Queue<TreeNode> q2= new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode curr1=q1.poll();
            TreeNode curr2=q2.poll();
            if(curr1==null && curr2==null) continue;
            if(curr1==null || curr2==null) return false;
            if(curr1.val!=curr2.val){
                return false;
            }
            //reverse the order
            q1.add(curr1.left);
            q2.add(curr2.right);

            q1.add(curr1.right);
            q2.add(curr2.left);
        }
        return true;
    }
}