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
    private int[] preorder;
    private int idx;
    private Map<Integer,Integer> posn;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        posn=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            posn.put(inorder[i],i);
        }
        idx=0;
        return build(0,inorder.length-1);
    }

    private TreeNode build(int l,int r){
        if(l>r){
            return null;
        }
        TreeNode root=new TreeNode(preorder[idx]);
        idx++;
        int spl=posn.get(root.val);
        root.left=build(l,spl-1);
        root.right=build(spl+1,r);
        return root;
    }
}
