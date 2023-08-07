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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> res=new ArrayList<>();
        //Iterative approach
        Stack<TreeNode> stk=new Stack<>();
        TreeNode curr=root;
        stk.push(curr);
        while(curr!=null && !stk.isEmpty()){
            res.add(curr.val);
            if(curr.right!=null){
                stk.push(curr.right);
            }
            if(curr.left!=null){
                stk.push(curr.left);
            }
            curr=stk.pop();
        }
        // preorder(root, res);
        return res;
    }
    public void preorder(TreeNode root, List<Integer> res){
        if(root==null) return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}