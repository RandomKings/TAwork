public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(5);

        int sum = tree.sumOfKeys(tree.root);
        int c = tree.countOfItems(tree.root);
        int maxValue = tree.getMaxValue(tree.root);
        System.out.println("Sum of keys: " + sum);
        System.out.println("Number of Items: " + c );
        System.out.println("Maximum value in the tree: " + maxValue);
    }
}
//i did all 3 as practice :)
