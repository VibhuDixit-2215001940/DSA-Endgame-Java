import java.util.*;

public class BinaryTree {
    class Node {
        int val;
        Node left, right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        root = CreateTree();
    }

    private Node CreateTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if (hlc)
            nn.left = CreateTree();
        boolean hrc = sc.nextBoolean();
        if (hrc)
            nn.right = CreateTree();
        return nn;
    }

    public void Display() {
        Display(root);
    }

    private void Display(Node nn) {
        if (nn != null) {
            System.out.print(nn.val + " ");
            Display(nn.left);
            Display(nn.right);
        }
    }

    public int Sum() {
        return Sum(root);
    }

    private int Sum(Node nn) {
        if (nn != null) {
            return nn.val + Sum(nn.left) + Sum(nn.right);
        }
        return 0;
    }

    public int max() {
        return max(root);
    }

    private int max(Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = max(nn.left);
        int rightMax = max(nn.right);
        return Math.max(nn.val, Math.max(leftMax, rightMax));
    }

    public boolean findNode(int key) {
        return findNode(root, key);
    }

    private boolean findNode(Node nn, int key) {
        if (nn == null)
            return false;
        if (nn.val == key)
            return true;
        return findNode(nn.left, key) || findNode(nn.right, key);
    }

    public int height() {
        return height(root);
    }

    private int height(Node nn) {
        if (nn == null)
            return -1;
        int lh = height(nn.left);
        int rh = height(nn.right);
        return Math.max(lh, rh) + 1;
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node nn) {
        if (nn == null)
            return;
        System.out.println(nn.val + " ");
        preorder(nn.left);
        preorder(nn.right);
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node nn) {
        if (nn == null)
            return;
        inorder(nn.left);
        System.out.print(nn.val + " ");
        inorder(nn.right);
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node nn) {
        if (nn == null)
            return;
        postorder(nn.left);
        postorder(nn.right);
        System.out.print(nn.val + " ");
    }

    public void levelOrder() {
        levelOrder(root);
        System.out.println();
    }

    private void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node rv = q.remove();
            System.out.print(rv.val + " ");
            if (rv.left != null) {
                q.add(rv.left);
            }
            if (rv.right != null) {
                q.add(rv.right);
            }
            System.out.println();
        }
    }
}
