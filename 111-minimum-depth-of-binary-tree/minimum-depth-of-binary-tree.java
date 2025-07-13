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
    List<Integer> ls=new ArrayList<>();
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        allWays(root,1);
        Collections.sort(ls);
        return ls.get(0);
    }
    private void allWays(TreeNode root,int count){
        if(root.left==null && root.right==null) {
            ls.add(count);
            return;    
        }
        if(root.left==null) {
             allWays(root.right,count+1);
             return;
             }
        else if(root.right==null){
             allWays(root.left,count+1);
             return;
        }
        allWays(root.left,count+1);
        allWays(root.right,count+1);
        return;
    }
}