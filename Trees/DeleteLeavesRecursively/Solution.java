package Trees.DeleteLeavesRecursively;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    
    HashSet<TreeNode> set = new HashSet<>();
    public List<Integer> deleteLeaves(TreeNode root){
        if ( root  == null ){
            return null;
        }

        if(set.contains(root)){
            return null;
        }
        if(root.left == null  && root.right == null) {
            List<Integer> result = new ArrayList<>();
            result.add(root.val);
            set.add(root);
            return result;
        }

        List<Integer> res = deleteLeaves(root.left);
        res.addAll(deleteLeaves(root.right));
        res.add(root.val);
        set.add(root);
        return res;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right =new TreeNode(5);
        root.left.left = new TreeNode(4);

        Solution obj =  new Solution();
        System.out.println(obj.deleteLeaves(root));
    }
}
