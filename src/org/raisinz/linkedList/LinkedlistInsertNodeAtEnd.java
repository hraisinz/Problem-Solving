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

    //Using iterative method
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

    //Using Recursion
    private void inserNodeAtEndRecursion(Node current,Node node){
        if(head == null){
            head=node;
            return;
        }
        if(current.getNext() == null){
            current.next=node;
            return;
        }
        inserNodeAtEndRecursion(current.getNext(),node);
    }

    public void inserNodeAtEndRec(int data){
        Node node = new Node(data);
        inserNodeAtEndRecursion(head,node);
    }

    private void getListRecursion(Node temp){
        if(temp == null){
            return;
        }
        System.out.println(temp.getData());
        getListRecursion(temp.getNext());
    }
    public void getListRec(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        getListRecursion(head);
    }

    public static void main(String[] args) {
        LinkedlistInsertNodeAtEnd linkedlist = new LinkedlistInsertNodeAtEnd();
        linkedlist.inserNodeAtEnd(10);
        linkedlist.inserNodeAtEnd(20);
        linkedlist.inserNodeAtEnd(30);
        linkedlist.inserNodeAtEnd(40);
        linkedlist.getList();
        System.out.println("\nUsing Recursion");
        LinkedlistInsertNodeAtEnd linkedlistInsertNodeAtEnd = new LinkedlistInsertNodeAtEnd();
        linkedlistInsertNodeAtEnd.inserNodeAtEndRec(100);
        linkedlistInsertNodeAtEnd.inserNodeAtEndRec(200);
        linkedlistInsertNodeAtEnd.inserNodeAtEndRec(300);
        linkedlistInsertNodeAtEnd.inserNodeAtEndRec(400);
        linkedlistInsertNodeAtEnd.inserNodeAtEndRec(500);
        linkedlistInsertNodeAtEnd.inserNodeAtEndRec(600);
        linkedlistInsertNodeAtEnd.getListRec();
    }
}




