package org.raisinz.tree;

import java.util.Stack;

public class BSTLevelorderIterative {

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

        boolean isLeaf(){
            return left==null ? right == null :false;
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
        System.out.println("\nInorder");
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

    public void getPreorder(){
        System.out.println("\nPreorder");
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (! stack.isEmpty()){
            Node current = stack.pop();
            System.out.println(current.getData());
            if(current.getRight() != null){
                stack.push(current.getRight());
            }
            if(current.getLeft()!=null){
                stack.push(current.getLeft());
            }
        }
    }

    public void getPostorder(){
        System.out.println("\nPostorder");
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (! stack.isEmpty()){
            Node current = stack.peek();
            if(current.isLeaf()){
                Node node = stack.pop();
                System.out.println(node.getData());
            }else{
                if(current.getRight() != null){
                    stack.push(current.getRight());
                    current.right=null;
                }
                if(current.getLeft() != null)
                {
                    stack.push(current.getLeft());
                    current.left=null;
                }
            }
        }
    }
    public static void main(String[] args) {

        BSTLevelorderIterative bstLevelorderIterative = new BSTLevelorderIterative();
        bstLevelorderIterative.insert(10);
        bstLevelorderIterative.insert(6);
        bstLevelorderIterative.insert(25);
        bstLevelorderIterative.insert(4);
        bstLevelorderIterative.insert(5);
        bstLevelorderIterative.insert(20);
        bstLevelorderIterative.insert(30);
        bstLevelorderIterative.getInorder();
        bstLevelorderIterative.getPreorder();
        bstLevelorderIterative.getPostorder();

    }
}
