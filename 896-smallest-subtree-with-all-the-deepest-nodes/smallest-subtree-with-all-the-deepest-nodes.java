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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return root;
        int rLeft=solve(root.left);
        int rRight=solve(root.right);
        if(rLeft==rRight) return root;
        if(rLeft>rRight) return subtreeWithAllDeepest(root.left);
        else return subtreeWithAllDeepest(root.right);
    }
    private int solve(TreeNode root){
        if(root==null)  return 0;
        return 1+Math.max(solve(root.left),solve(root.right));
    }
}