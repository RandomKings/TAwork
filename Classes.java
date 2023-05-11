class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public int sumOfKeys(Node node) {
        if (node == null) {
            return 0;
        }
        return node.key + sumOfKeys(node.left) + sumOfKeys(node.right);
        }
     public int countOfItems(Node root){
        if (root == null) {
            return 0;
        }
        int count = 1;
         count += countOfItems(root.left);
         count += countOfItems(root.right);
         return count;
     }

    public int getMaxValue(Node node) {
        if (node == null) {
            return -1;
        }

        int maxValue = node.key;


        int leftMax = getMaxValue(node.left);
        if (leftMax > maxValue) {
            maxValue = leftMax;
        }


        int rightMax = getMaxValue(node.right);
        if (rightMax > maxValue) {
            maxValue = rightMax;
        }

        return maxValue;
    }
    }

