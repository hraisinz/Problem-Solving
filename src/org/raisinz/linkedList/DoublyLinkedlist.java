package org.raisinz.linkedList;

public class DoublyLinkedlist {

    private Node head;

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

    public void insertAtHead(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
            return;
        }
        head.prev=node;
        node.next=head;
        head=node;
    }

    public void deleteFromHead(){
        if(head== null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        head=head.getNext();
        head.prev=null;
    }

    private int getLengthRecursive(Node node){
        if(node == null) return 0;
        return 1+getLengthRecursive(node.next);
    }

    public int getLength(){
        return getLengthRecursive(head);
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

        DoublyLinkedlist doublyLinkedlist = new DoublyLinkedlist();
        doublyLinkedlist.insertAtHead(10);
        doublyLinkedlist.insertAtHead(20);
        doublyLinkedlist.insertAtHead(30);
        doublyLinkedlist.insertAtHead(50);
        doublyLinkedlist.insertAtHead(60);
        doublyLinkedlist.deleteFromHead();
        doublyLinkedlist.getList();
        System.out.println("Length is : "+doublyLinkedlist.getLength());
    }
}
