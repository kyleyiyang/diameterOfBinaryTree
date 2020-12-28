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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] arr = {0};
        edges(root,arr);
        return arr[0];
    } 
    public static int edges (TreeNode node,int[] arr) {
        if (node==null) return 0;
        int l = edges (node.left,arr);
        int r = edges (node.right,arr);
        arr[0]=Math.max(arr[0],r+l);
        return Math.max(l,r)+1;
            
    }
}
