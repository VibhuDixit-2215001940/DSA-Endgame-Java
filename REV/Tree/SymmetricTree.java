class Solution {
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left,root.right);
    }
    public boolean Symmetric(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        boolean left = Symmetric(root1.left,root2.right);
        boolean right = Symmetric(root1.right,root2.left);
        return left&&right;
    }
}