package org.raisinz.tree;

import java.util.Stack;

public class BSTPreorderIterative {

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

    public void getInorder(){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        Node current=root;
        while (current != null || stack.size()>0){
            while (current != null){
                stack.push(current);
                current=current.getLeft();
            }
            current=stack.pop();
            System.out.println(current.getData());
            current=current.getRight();
        }
    }
    public static void main(String[] args) {

        BSTPreorderIterative bstPreorderIterative = new BSTPreorderIterative();
        bstPreorderIterative.insert(10);
        bstPreorderIterative.insert(6);
        bstPreorderIterative.insert(25);
        bstPreorderIterative.insert(4);
        bstPreorderIterative.insert(5);
        bstPreorderIterative.insert(20);
        bstPreorderIterative.insert(30);
        bstPreorderIterative.getInorder();

    }
}
