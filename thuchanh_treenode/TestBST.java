package thuchanh_treenode;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Phuc");
        tree.insert("Phuong");
        tree.insert("Bao");
        tree.insert("Van");
        tree.insert("Nhi");
        tree.insert("Phong");
        tree.insert("My");
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
