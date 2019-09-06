package org.raisinz.linkedList;

public class DoublyLinkedlistLastnodeToFront {

    private Node head;
    private Node tail;

    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }

        public Node getPrev() {
            return prev;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        tail.next=null;

    }

    public int getLength(){
        Node temp=head;
        int count=0;
        if(head == null){
            System.out.println("List is Empty");
            return count;
        }
        while (temp != null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }

    private int getLengthRecursive(Node node){
        if(node == null) return 0;
        return 1+getLengthRecursive(node.next);
    }


    public int length(){
        return getLengthRecursive(head);
    }

    public void movingLastNodeToFront(){
        if(head == null || head.next == null) return;
        tail.prev.next=null;
        tail.prev=null;
        tail.next=head;
        head.prev=tail;
        head=tail;
    }

    public void getList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while (temp != null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {

        DoublyLinkedlistLastnodeToFront doublyLinkedlistLastnodeToFront = new DoublyLinkedlistLastnodeToFront();
        doublyLinkedlistLastnodeToFront.insertAtEnd(10);
        doublyLinkedlistLastnodeToFront.insertAtEnd(20);
        doublyLinkedlistLastnodeToFront.insertAtEnd(30);
        doublyLinkedlistLastnodeToFront.insertAtEnd(40);
        doublyLinkedlistLastnodeToFront.insertAtEnd(50);
        System.out.println("Length is : "+doublyLinkedlistLastnodeToFront.getLength());
        System.out.println("Length is : "+doublyLinkedlistLastnodeToFront.length());
        doublyLinkedlistLastnodeToFront.movingLastNodeToFront();
        doublyLinkedlistLastnodeToFront.getList();
    }
}
