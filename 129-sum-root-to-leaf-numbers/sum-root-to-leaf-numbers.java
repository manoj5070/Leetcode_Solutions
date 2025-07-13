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
    public int sumNumbers(TreeNode root) {
        allWaysSum(root,0);
        int total=0;
        for(int num:ls){
            total+=num;
        }
        return total;
    }
    private void allWaysSum(TreeNode root,int sum){
        if(root==null) return;
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
             ls.add(sum);
             return;
        }
         allWaysSum(root.left,sum);
         allWaysSum(root.right,sum);
        return;
    }
}