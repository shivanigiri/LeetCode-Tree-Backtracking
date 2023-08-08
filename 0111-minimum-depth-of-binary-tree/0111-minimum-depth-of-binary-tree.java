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
    // public int minDepth(TreeNode root) {
    //     if(root==null) return (int)1e9;
    //     if(root.left==null && root.right==null) return 1;
    //     int left=minDepth(root.left);
    //     int right=minDepth(root.right);
    //     return (Math.min(left,right)+1);
    // }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int minDepth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            minDepth++;
            int size = queue.size();
            while (size-- > 0){
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null)
                return minDepth;
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
            }
        }
        return 0;
    }
}