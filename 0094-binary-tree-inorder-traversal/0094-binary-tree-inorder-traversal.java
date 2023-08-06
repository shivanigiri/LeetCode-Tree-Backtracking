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
    public List<Integer> inorderTraversal(TreeNode root) {
        // //iterative
        // List<Integer> res= new ArrayList<>();
        // Stack<TreeNode> stk= new Stack<>();
        // TreeNode curr=root;
        // while(curr!=null || !stk.isEmpty()){
        //     if(curr!=null){
        //         stk.push(curr);
        //         curr=curr.left;
        //     }else{
        //         curr=stk.pop();
        //         res.add(curr.val);
        //         curr=curr.right;
        //     }
        // }
        // return res;

        List<Integer> res= new ArrayList<>();
        inorder(root,res);
        return res;
    }
    public void inorder(TreeNode root, List<Integer> res){
        if(root==null) return ;

        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}