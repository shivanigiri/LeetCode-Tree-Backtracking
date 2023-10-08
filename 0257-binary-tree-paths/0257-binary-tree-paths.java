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
    List<String> res= new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null){
            findPath(root,""+root.val);
        }
        return res;
    }
    public void findPath(TreeNode root, String str){
        if(root==null){
            return;
        }
        if(root!=null && root.left==null && root.right==null){
            res.add(str);
        }
        if(root.left!=null){
            findPath(root.left,str+"->"+root.left.val);
        }
        if(root.right!=null){
            findPath(root.right,str+"->"+root.right.val);
        }
    }
}