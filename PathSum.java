/**
 * Path Sum
 * Given a binary tree and a sum, determine if the tree has a
 * root-to-leaf path such that adding up all the values along
 * the path equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2
 * which sum is 22.
 * 
 * http://oj.leetcode.com/problems/path-sum/
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (root == null) return false;
        else {
            if (root.left == null && root.right == null && root.val == sum) return true;
            else return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}