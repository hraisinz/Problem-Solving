package org.raisinz.tree;

public class BSTSearchElement {

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

    public boolean search(Node root,int data){
        if(root == null) return false;
        else if(root.getData() == data) return true;
        else if(data <= root.getData()) return search(root.getLeft(),data);
        else return  search(root.getRight(),data);
    }

    public boolean searchIterative(Node root,int data){
        while (root != null){
            if(data == root.getData()) return true;
            else if(data < root.getData()) root=root.getLeft();
            else root=root.getRight();
        }
        return false;
    }
    public static void main(String[] args) {

        BSTSearchElement bstSearchElement = new BSTSearchElement();
        bstSearchElement.insert(10);
        bstSearchElement.insert(6);
        bstSearchElement.insert(25);
        bstSearchElement.insert(4);
        bstSearchElement.insert(5);
        bstSearchElement.insert(20);
        bstSearchElement.insert(30);
        bstSearchElement.getTree(bstSearchElement.getRoot());
        int key=5;
        boolean found = bstSearchElement.search(bstSearchElement.getRoot(), key);
        if(found) System.out.println("Element found");
        else System.out.println("Not Found");

        System.out.println(bstSearchElement.searchIterative(bstSearchElement.getRoot(),25));
    }
}
