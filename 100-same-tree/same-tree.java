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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isValid(p,q);
    }
    private boolean isValid(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if((p==null && q!=null) || (q==null && p!=null) || (p.val!=q.val)) return false;
        return isValid(p.left,q.left) && isValid(p.right,q.right);
    }
}