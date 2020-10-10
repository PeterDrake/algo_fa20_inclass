package inclass;

public class BinaryNode<K> {

    K key;

    BinaryNode<K> left;

    BinaryNode<K> right;

    public BinaryNode(K key) {
        this.key = key;
    }

    public BinaryNode(K key, BinaryNode<K> left, BinaryNode<K> right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

}
