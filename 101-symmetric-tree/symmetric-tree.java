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
        return isValid(root.left,root.right);
    }
    private boolean isValid(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;

        if((left==null && right!=null) || (right==null && left!=null) || (left.val!=right.val)) return false;
        return isValid(left.left,right.right) && isValid(left.right,right.left);
    }
}