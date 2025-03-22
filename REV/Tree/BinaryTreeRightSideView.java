class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        if (root == null)
            return ll;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode rv = null;
            int n = q.size();
            while (n-- > 0) {
                rv = q.poll();
                if (rv.left != null)
                    q.add(rv.left);
                if (rv.right != null)
                    q.add(rv.right);
            }
            ll.add(rv.val);
        }
        return ll;
    }
}

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    public void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null)
            return;
        if (currDepth == result.size())
            result.add(curr.val);
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }
}