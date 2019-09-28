package org.raisinz.tree;

public class BinarySearchTreeUsingRecursion {

    private Node root;

    public Node getRoot() {
        return root;
    }

    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
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

    private Node insertRecursive(Node current,int data){
        if(current == null) return new Node(data);
        if(data <= current.getData()) current.left=insertRecursive(current.left,data);
        else if(data >current.getData()) current.right=insertRecursive(current.right,data);
        return current;
    }

    public void insert(int data){
        root=insertRecursive(root,data);
    }

    public void getTree(Node root){
        if(root == null) return;
            getTree(root.getLeft());
            System.out.println(" "+root.getData());
            getTree(root.getRight());
    }

    public static void main(String[] args) {

        BinarySearchTreeUsingRecursion binarySearchTreeUsingRecursion = new BinarySearchTreeUsingRecursion();
        binarySearchTreeUsingRecursion.insert(10);
        binarySearchTreeUsingRecursion.insert(6);
        binarySearchTreeUsingRecursion.insert(25);
        binarySearchTreeUsingRecursion.insert(4);
        binarySearchTreeUsingRecursion.insert(5);
        binarySearchTreeUsingRecursion.insert(20);
        binarySearchTreeUsingRecursion.insert(30);
        binarySearchTreeUsingRecursion.getTree(binarySearchTreeUsingRecursion.getRoot());
    }
}
