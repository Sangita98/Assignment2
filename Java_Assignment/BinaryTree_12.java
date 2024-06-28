package assignment;

class TreeNode {
    int key;
    TreeNode left;
	TreeNode right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree_12 {
    TreeNode rootNode;

    public BinaryTree_12() {
        rootNode = null;
    }

    void insert(int key) {
        rootNode = insertRec(rootNode, key);
    }

    TreeNode insertRec(TreeNode rootNode, int key) {
        if (rootNode == null) {
            rootNode = new TreeNode(key);
            return rootNode;
        }

        if (key < rootNode.key) {
            rootNode.left = insertRec(rootNode.left, key);
        } else if (key > rootNode.key) {
            rootNode.right = insertRec(rootNode.right, key);
        }
        return rootNode;
    }

    void deleteKey(int key) {
        rootNode = deleteRec(rootNode, key);
    }

    TreeNode deleteRec(TreeNode rootNode, int key) {
        if (rootNode == null)
            return rootNode;

        if (key < rootNode.key) {
            rootNode.left = deleteRec(rootNode.left, key);
        } else if (key > rootNode.key) {
            rootNode.right = deleteRec(rootNode.right, key);
        } else {
            if (rootNode.left == null)
                return rootNode.right;
            else if (rootNode.right == null)
                return rootNode.left;

            rootNode.key = minValue(rootNode.right);
            rootNode.right = deleteRec(rootNode.right, rootNode.key);
        }
        return rootNode;
    }

    int minValue(TreeNode rootNode) {
        int minv = rootNode.key;
        while (rootNode.left != null) {
            minv = rootNode.left.key;
            rootNode = rootNode.left;
        }
        return minv;
    }

    void inorder() {
        inorderRec(rootNode);
    }

    void inorderRec(TreeNode rootNode) {
        if (rootNode != null) {
            inorderRec(rootNode.left);
            System.out.print(rootNode.key + " ");
            inorderRec(rootNode.right);
        }
    }

    void preorder() {
        preorderRec(rootNode);
    }

    void preorderRec(TreeNode rootNode) {
        if (rootNode != null) {
            System.out.print(rootNode.key + " ");
            preorderRec(rootNode.left);
            preorderRec(rootNode.right);
        }
    }

    void postorder() {
        postorderRec(rootNode);
    }

    void postorderRec(TreeNode rootNode) {
        if (rootNode != null) {
            postorderRec(rootNode.left);
            postorderRec(rootNode.right);
            System.out.print(rootNode.key + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree_12 tree = new BinaryTree_12();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);
        tree.insert(100);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\n\nPreorder traversal:");
        tree.preorder();

        System.out.println("\n\nPostorder traversal:");
        tree.postorder();

        System.out.println("\n\nDelete 20:");
        tree.deleteKey(20);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }
}
