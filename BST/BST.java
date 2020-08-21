package BST;


public class BST<E extends Comparable<E>> {
    private Node<E> root;
    private E e;
    int size = 0;

    BST() {
        root = null;
    }

    void delete(E e) {
        root = deleteNode(root, e);
        this.e = e;
    }

    private Node<E> deleteNode(Node<E> root, E e) {
        if (root == null)
            return null;
        if (e.compareTo(root.value) < 0) {
            root.left = deleteNode(root.left, e);
        } else if (e.compareTo(root.value) > 0) {
            root.right = deleteNode(root.right, e);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = deleteNode(root.right, root.value);
        }
        return root;
    }

    private E minValue(Node<E> root) {
        E min = root.value;
        while (root.left != null) {
            min = root.left.value;
            root = root.left;
        }
        return min;
    }
    void insert(E e){
        root = insertNode(root, e);
    }
    private Node<E> insertNode(Node<E> root, E e){
        if (root == null){
            root = new Node<>(e);
            return root;
        }
        if (e.compareTo(root.value) < 0){
            root.left = insertNode(root, e);
        }else  if (e.compareTo(root.value) > 0){
            root.right = insertNode(root.right, e);
        }
        return root;
    }
    void inoder(){
        inoderNode(root);
    }
    private void inoderNode(Node<E> root){
        if (root != null){
            inoderNode(root.left);
            System.out.println(root.value);
            inoderNode(root.right);

        }
    }
}
