package org.raisinz.tree;

public class BSTDepthFirstSearch {

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


    public void getPreOrder(Node root){
        if(root == null) return;
        System.out.println(" "+root.getData());
        getPreOrder(root.getLeft());
        getPreOrder(root.getRight());

    }

    public void getInOrder(Node root){
        if(root == null) return;
        getInOrder(root.getLeft());
        System.out.println(" "+root.getData());
        getInOrder(root.getRight());

    }
    public static void main(String[] args) {

        BSTDepthFirstSearch bstDepthFirstSearch = new BSTDepthFirstSearch();
        bstDepthFirstSearch.insert(10);
        bstDepthFirstSearch.insert(6);
        bstDepthFirstSearch.insert(25);
        bstDepthFirstSearch.insert(4);
        bstDepthFirstSearch.insert(5);
        bstDepthFirstSearch.insert(20);
        bstDepthFirstSearch.insert(30);
        System.out.println("Preorder");
        bstDepthFirstSearch.getPreOrder(bstDepthFirstSearch.getRoot());
        System.out.println("\nInorder");
        bstDepthFirstSearch.getInOrder(bstDepthFirstSearch.getRoot());
    }
}
