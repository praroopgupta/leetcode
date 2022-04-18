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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        } else {
            int lCount = 0;
            int rCount = 0;
            if(root.left != null){
                lCount = maxDepth(root.left);
            }
            if(root.right != null) {
                rCount = maxDepth(root.right);
            }
            if(lCount < rCount){
                return rCount+1;
            } else {
                return lCount+1;
            }
        }
    }
}