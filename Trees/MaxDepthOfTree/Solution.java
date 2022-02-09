package Trees.MaxDepthOfTree;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxDepth = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
        return maxDepth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Solution obj = new Solution();
        System.out.println(obj.maxDepth(root));
    }
}
