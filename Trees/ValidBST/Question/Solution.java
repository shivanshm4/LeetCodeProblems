package Trees.ValidBST.Question;

import java.util.ArrayList;
import java.util.List;

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

    List<Integer> inOrderList;
    public boolean isValidBST(TreeNode root) {
        this.inOrderTraversal(root);
        
        for(int i = 1; i<this.inOrderList.size(); i++){
            if(this.inOrderList.get(i)<this.inOrderList.get(i-1)) {
                return false;
            }
        }
        
        return true;
    }
    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        this.inOrderList.add(root.val);
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(2), new TreeNode(2));
        Solution obj = new Solution();
        obj.inOrderList = new ArrayList<>();
        System.out.println(obj.isValidBST(root));
    }
}
