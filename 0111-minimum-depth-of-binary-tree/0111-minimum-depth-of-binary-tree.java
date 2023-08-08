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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
        if(root.left==null) return minDepth(root.right)+1;
        if(root.right==null) return minDepth(root.left)+1;
        
        int l=minDepth(root.left);
        int r=minDepth(root.right); 
        
        return Math.min(l,r)+1;
    }

    // public int minDepth(TreeNode root) {
    //     if (root == null)
    //         return 0;
    //     int minDepth = 0;
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root);
    //     while (!queue.isEmpty()){
    //         minDepth++;
    //         TreeNode node = queue.poll();
    //         if (node.left == null && node.right == null)
    //             return minDepth;
    //         if (node.left != null)
    //             queue.add(node.left);
    //         if (node.right != null)
    //             queue.add(node.right);
    //     }
    //     return 0;
    // }
}