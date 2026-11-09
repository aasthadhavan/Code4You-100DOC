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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            int s=q.size();
            l++;
            List<Integer> cl=new ArrayList<>();
            while(s-->0){
                TreeNode c=q.poll();
                cl.add(c.val);
                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            if(l%2==0){
                Collections.reverse(cl);
            }
            ans.add(cl);
        }
        return ans;
    }
}
