package org.raisinz.tree;

public class BSTFindHeight {
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

    public int getHeight(Node root){
        if(root == null){
            System.out.println("Tree is empty");
            return 0;
        }
        else{
            int leftHeight=0;
            int rightHeight=0;
            if(root.getLeft() != null) leftHeight=getHeight(root.getLeft());
            if(root.getRight() != null) rightHeight=getHeight(root.getRight());
            int max=(leftHeight >rightHeight)?leftHeight:rightHeight;
            return (max+1);
        }
    }

    public static void main(String[] args) {

        BSTFindHeight bstFindHeight = new BSTFindHeight();
        bstFindHeight.insert(10);
        bstFindHeight.insert(6);
        bstFindHeight.insert(25);
        bstFindHeight.insert(4);
        bstFindHeight.insert(5);
        bstFindHeight.insert(20);
        bstFindHeight.insert(30);
        bstFindHeight.getTree(bstFindHeight.getRoot());
        System.out.println("Height of the tree is : "+bstFindHeight.getHeight(bstFindHeight.getRoot()));

    }
}
