package org.raisinz.tree;

public class BSTFIndMinElement {

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

    public int getMin(Node root){
        Node current=root;
        while (current.getLeft() != null)
        {
            current=current.getLeft();
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

        BSTFIndMinElement bstfIndMinElement = new BSTFIndMinElement();
        bstfIndMinElement.insert(10);
        bstfIndMinElement.insert(6);
        bstfIndMinElement.insert(25);
        bstfIndMinElement.insert(4);
        bstfIndMinElement.insert(5);
        bstfIndMinElement.insert(20);
        bstfIndMinElement.insert(30);
        System.out.println("Min Element : "+bstfIndMinElement.getMin(bstfIndMinElement.getRoot()));

    }
}
