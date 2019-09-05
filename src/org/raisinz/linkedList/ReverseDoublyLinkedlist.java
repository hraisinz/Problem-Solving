package org.raisinz.linkedList;

public class ReverseDoublyLinkedlist {
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


    public void reverseList(){
        Node prev=null;
        Node current=head;
        Node next=null;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
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
        ReverseDoublyLinkedlist reverseDoublyLinkedlist = new ReverseDoublyLinkedlist();
        reverseDoublyLinkedlist.insertAtEnd(10);
        reverseDoublyLinkedlist.insertAtEnd(20);
        reverseDoublyLinkedlist.insertAtEnd(30);
        reverseDoublyLinkedlist.insertAtEnd(40);
        reverseDoublyLinkedlist.insertAtEnd(50);
        reverseDoublyLinkedlist.reverseList();
        reverseDoublyLinkedlist.getList();
    }
}
