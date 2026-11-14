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
    private int[] postorder;
    private int idx;
    private Map<Integer,Integer> posn;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder=postorder;
        posn=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            posn.put(inorder[i],i);
        }
        idx=postorder.length-1;
        return build(0,inorder.length-1);
    }  
        private TreeNode build(int l,int r){
        if(l>r){
            return null;
        }
        TreeNode root=new TreeNode(postorder[idx]);
        idx--;
        int spl=posn.get(root.val);
        root.right=build(spl+1,r);
        root.left=build(l,spl-1);
        
        return root;
        
    }
}
