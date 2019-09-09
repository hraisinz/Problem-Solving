package org.raisinz.tree;

public class BSTFIndMaxElement {

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

    public int getMax(Node root){
        if(root == null){
            System.out.println("Tree is empty");
            return -1;
        }
        Node current=root;
        while (current.getRight() != null)
        {
            current=current.getRight();
        }
        return current.getData();
    }

    public void getTree(Node root){
        if(root == null) return;
        getTree(root.getLeft());
        System.out.println(" "+root.getData());
        getTree(root.getRight());

    }

    public static void main(String[] args) {
        BSTFIndMaxElement bstfIndMaxElement = new BSTFIndMaxElement();
        bstfIndMaxElement.insert(10);
        bstfIndMaxElement.insert(6);
        bstfIndMaxElement.insert(25);
        bstfIndMaxElement.insert(4);
        bstfIndMaxElement.insert(5);
        bstfIndMaxElement.insert(20);
        bstfIndMaxElement.insert(30);
        System.out.println("Max Element : "+bstfIndMaxElement.getMax(bstfIndMaxElement.getRoot()));

    }
}
