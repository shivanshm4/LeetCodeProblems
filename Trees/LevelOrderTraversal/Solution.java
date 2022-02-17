package Trees.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null){
            return null;
        }
        List<List<Integer>> levelOrder = new ArrayList<>();
        List<Integer> levelList = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            levelList = new ArrayList<>();
            int size=bfs.size();
            for(int i=1; i<=size;i++){
                    TreeNode front = bfs.poll();
                    if(front!=null){
                        levelList.add(front.val);
                        bfs.add(front.left);
                        bfs.add(front.right); 
                    }
            }
            if(levelList != null){
                levelOrder.add(levelList);
            }
            
        }
        return levelOrder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(15);
        root.right = new TreeNode(20);
        root.right.left =new TreeNode(30);
        root.right.left = new TreeNode(40);

        Solution obj =  new Solution();
        System.out.println(obj.levelOrder(root));
    }
}
