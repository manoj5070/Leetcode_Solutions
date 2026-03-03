# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        def root1(root,st):
            if not root:
                return 0
            st=st*2+root.val
            if(not root.left and not root.right):
                return st
            return root1(root.left,st)+root1(root.right,st)
        return root1(root,0)


        
        