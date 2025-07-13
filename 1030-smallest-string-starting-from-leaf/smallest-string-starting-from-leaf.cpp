/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
string res;
  void solve(TreeNode* root ,string ans){
    if(root==NULL) return ;
     if(root!=NULL  && root->left==NULL && root->right ==NULL){
        ans+=char(root->val+'a');
        reverse(begin(ans),end(ans));
        if(res.empty()|| ans<res){
            res=ans;
        }
        return;
     }
    //  cout<<<<" \n";
     solve(root->left,ans+char(root->val+'a'));
     solve(root->right,ans+char(root->val+'a'));
  }
    string smallestFromLeaf(TreeNode* root) {
        solve(root,"");
       
       return res;
    }
};