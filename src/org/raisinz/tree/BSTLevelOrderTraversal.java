package org.raisinz.tree;

import java.util.*;

public class BSTLevelOrderTraversal {

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

    public void getLevelOrder(Node root){
        if(root == null) return;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current=((LinkedList<Node>) queue).getFirst();
            System.out.println(current.getData());
            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
            queue.remove();
        }
    }
    public static void main(String[] args) {

        BSTLevelOrderTraversal bstLevelOrderTraversal = new BSTLevelOrderTraversal();
        bstLevelOrderTraversal.insert(10);
        bstLevelOrderTraversal.insert(6);
        bstLevelOrderTraversal.insert(25);
        bstLevelOrderTraversal.insert(4);
        bstLevelOrderTraversal.insert(5);
        bstLevelOrderTraversal.insert(20);
        bstLevelOrderTraversal.insert(30);
        bstLevelOrderTraversal.getLevelOrder(bstLevelOrderTraversal.getRoot());

    }
}
