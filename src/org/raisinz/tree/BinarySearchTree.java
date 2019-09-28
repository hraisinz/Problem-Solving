package org.raisinz.tree;

import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){
        this.root=null;
    }

    public Node getRoot() {
        return root;
    }

    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    public void insert(int data)
    {
        Node node = new Node(data);
        if(root == null){
            root=node;
            return;
        }
        Node current=root;
        Node parent=null;
        while (true){
            parent=current;
            if(data <= current.getData()){
                current=current.getLeft();
                if(current == null){
                    parent.left=node;
                    return;
                }
            }
            else{
                current=current.getRight();
                if(current == null){
                    parent.right=node;
                    return;
                }
            }
        }
    }

    //Recursion
    public void getTree(Node root){
        if(root != null){
            getTree(root.getLeft());
            System.out.println(" "+root.getData());
            getTree(root.getRight());
        }
    }

    //Iterative
    public void getTreeIterative(Node root){

        Stack<Node> nodes = new Stack<>();
        while (true){
            while (root != null){
                nodes.push(root);
                root=root.getLeft();
            }
            if(nodes.isEmpty()) return;
            root=nodes.pop();
            System.out.println(root.getData());
            root=root.getRight();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(10);
        binarySearchTree.insert(8);
        binarySearchTree.insert(16);
        binarySearchTree.getTree(binarySearchTree.getRoot());
        binarySearchTree.getTreeIterative(binarySearchTree.getRoot());

    }
}
