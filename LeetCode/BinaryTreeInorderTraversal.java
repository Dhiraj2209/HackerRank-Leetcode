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
        List<Integer> li = new ArrayList<Integer>(); 
        helper(root, li); // helper function to add value in list
        return li; // return list
    }

    private void helper(TreeNode root, List<Integer> li){
        if(root == null){ // is root is null then return
            return;
        }

        helper(root.left, li); // left subtree
        li.add(root.val); // root ka data
        helper(root.right, li); // right subtree
    }
}
