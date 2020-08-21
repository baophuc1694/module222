package BST;

public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.insert(15);
        tree.insert(9);
        tree.insert(6);
        tree.insert(12);
        tree.insert(8);
        tree.insert(20);
        tree.insert(21);
        tree.insert(13);
        tree.inoder();
        System.out.println("==============");
        tree.delete(13);
        tree.inoder();
    }
}
