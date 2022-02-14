package Trees.ValidBST.Question;

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

    public boolean checkValidBST(TreeNode root, int upperBound, int lowerBound) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null) {
            if (root.right.val > root.val && root.right.val > lowerBound) {
                return checkValidBST(root.right, Integer.MAX_VALUE, root.val);
            }
        } else if (root.right == null) {
            if (root.left.val < root.val && root.left.val < upperBound) {
                return checkValidBST(root.left, root.val, Integer.MIN_VALUE);
            }
        } else if (root.left.val < root.val && root.left.val < upperBound && root.right.val > root.val) {
            return checkValidBST(root.left,root.val,Integer.MAX_VALUE)
                    && checkValidBST(root.right, Integer.MAX_VALUE, root.val );
        }
        return false;   
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(4, null, null), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        Solution obj = new Solution();
        System.out.println(obj.checkValidBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
