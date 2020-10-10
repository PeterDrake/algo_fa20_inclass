package inclass;

import edu.princeton.cs.algs4.StdOut;

public class BinaryTree<K> {

    private BinaryNode<K> root;

    public static void main(String[] args) {
        BinaryTree<Integer> t = new BinaryTree<>();
        t.root = new BinaryNode<>(1);
        t.root.left = new BinaryNode<>(2);
        t.root.right = new BinaryNode<>(3);
        t.root.left.left = new BinaryNode<>(4);
        t.root.left.right = new BinaryNode<>(5);
        t.root.right.left = new BinaryNode<>(6);
        t.root.right.right = new BinaryNode<>(7);
        t.traversePostOrder();
    }

    public void traverseLevelOrder() {
        Queue<BinaryNode<K>> q = new LinkedQueue<>();
        q.enqueue(root);
        while (!q.isEmpty()) {
            BinaryNode<K> n = q.dequeue();
            StdOut.println(n.key);
            if (n.left != null) {
                q.enqueue(n.left);
            }
            if (n.right != null) {
                q.enqueue(n.right);
            }
        }
    }

//    public void traversePreOrder() {
//        Stack<BinaryNode<K>> s = new LinkedStack<>();
//        s.push(root);
//        while (!s.isEmpty()) {
//            BinaryNode<K> n = s.pop();
//            StdOut.println(n.key);
//            if (n.right != null) {
//                s.push(n.right);
//            }
//            if (n.left != null) {
//                s.push(n.left);
//            }
//        }
//    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(BinaryNode root) {
        if (root != null) {
            StdOut.println(root.key);
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(BinaryNode root) {
        if (root != null) {
            traverseInOrder(root.left);
            StdOut.println(root.key);
            traverseInOrder(root.right);
        }
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(BinaryNode root) {
        if (root != null) {
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            StdOut.println(root.key);
        }
    }
}
