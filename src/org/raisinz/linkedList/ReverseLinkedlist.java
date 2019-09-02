package org.raisinz.linkedList;

public class ReverseLinkedlist {

    private Node head;
    private Node tail;

    private class Node{
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next=null;
        }

        private int getData() {
            return data;
        }

        private Node getNext() {
            return next;
        }
    }

    public void inserNodeAtEnd(int data){
        Node node = new Node(data);
        if(head == null) {
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }

    public void reverseList(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while (current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    public void getList(){
        Node temp=head;
        if(head == null){
            System.out.println("List is Empty");
        }
        while (temp != null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {

        ReverseLinkedlist reverseLinkedlist = new ReverseLinkedlist();
        reverseLinkedlist.inserNodeAtEnd(10);
        reverseLinkedlist.inserNodeAtEnd(20);
        reverseLinkedlist.inserNodeAtEnd(30);
        reverseLinkedlist.inserNodeAtEnd(40);
        reverseLinkedlist.inserNodeAtEnd(50);
        reverseLinkedlist.reverseList();
        reverseLinkedlist.getList();
    }
}
