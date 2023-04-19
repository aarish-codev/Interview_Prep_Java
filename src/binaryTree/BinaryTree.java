package binaryTree;

import stack.Stack;

public class BinaryTree {

    TreeNode<Integer> root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.getDefaultTree();
        tree.preOrderRecursive(tree.root);
        System.out.println();
        tree.preOrderIterative(tree.root);
    }

    public TreeNode getDefaultTree() {
        TreeNode<Integer> first = new TreeNode<>(1);
        TreeNode<Integer> second = new TreeNode<>(2);
        TreeNode<Integer> third = new TreeNode<>(3);
        TreeNode<Integer> fourth = new TreeNode<>(4);
        TreeNode<Integer> fifth = new TreeNode<>(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        return root;
    }


    public void preOrderRecursive(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrderRecursive(node.left);
        preOrderRecursive(node.right);
    }

    public void preOrderIterative(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        System.out.println();
    }
}
