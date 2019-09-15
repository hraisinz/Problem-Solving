package org.raisinz.linkedList;

public class LinkedlistInsertNodeAtEnd {

    private Node head;

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
            return;
        }
        Node current=head;
        while (current.getNext() != null){
            current=current.getNext();
        }
        current.next=node;
    }

    public void getList(){
        Node temp=head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (temp != null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    public static void main(String[] args) {
        LinkedlistInsertNodeAtEnd linkedlist = new LinkedlistInsertNodeAtEnd();
        linkedlist.inserNodeAtEnd(10);
        linkedlist.inserNodeAtEnd(20);
        linkedlist.inserNodeAtEnd(30);
        linkedlist.inserNodeAtEnd(40);
        linkedlist.getList();
    }
}




