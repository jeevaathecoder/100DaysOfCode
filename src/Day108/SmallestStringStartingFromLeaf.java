//package Day108;
//https://leetcode.com/problems/smallest-string-starting-from-leaf/?envType=daily-question&envId=2024-04-17
//988. Smallest String Starting From Leaf
//public class SmallestStringStartingFromLeaf {
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }
//     */
//    class Solution {
//        public String smallestFromLeaf(TreeNode root) {
//            StringBuilder smallest = new StringBuilder();
//            dfs(root, new StringBuilder(), smallest);
//            return smallest.toString();
//        }
//
//        private void dfs(TreeNode node, StringBuilder path, StringBuilder smallest) {
//            if (node == null) return;
//
//
//            path.append((char)('a' + node.val));
//
//
//            if (node.left == null && node.right == null) {
//                String currentString = path.reverse().toString();
//                if (smallest.length() == 0 || currentString.compareTo(smallest.toString()) < 0) {
//                    smallest.setLength(0);
//                    smallest.append(currentString);
//                }
//                path.reverse();
//            }
//
//
//            dfs(node.left, path, smallest);
//            dfs(node.right, path, smallest);
//
//
//            path.setLength(path.length() - 1);
//        }
//    }
//}
