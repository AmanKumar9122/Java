class BinaryTree1 {
    // Define the structure of a tree node
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Root node of the binary tree
    Node root;

    // Constructor to initialize an empty tree
    public BinaryTree1() {
        root = null;
    }

    // Method to insert nodes in the binary tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Helper method for inserting nodes recursively
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // In-order traversal of the binary tree
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // Method to calculate the height of the binary tree
    public int getHeight() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Method to calculate the depth of a given node
    public int getDepth(Node node) {
        return depth(root, node, 0);
    }

    private int depth(Node root, Node node, int currentDepth) {
        if (root == null) return -1;
        if (root == node) return currentDepth;
        int leftDepth = depth(root.left, node, currentDepth + 1);
        if (leftDepth != -1) return leftDepth;
        return depth(root.right, node, currentDepth + 1);
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();  // Change made here to use BinaryTree1

        // Insert nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // In-order traversal (sorted output)
        System.out.print("In-order traversal: ");
        tree.inOrder();  // Output: 20 30 40 50 60 70 80
        System.out.println();

        // Height of the tree
        System.out.println("Height of tree: " + tree.getHeight());  // Output: 2

        // Depth of a specific node (e.g., node with value 60)
        Node nodeToCheck = tree.root.left.right;  // node with value 40
        System.out.println("Depth of node 40: " + tree.getDepth(nodeToCheck));  // Output: 2
    }
}
