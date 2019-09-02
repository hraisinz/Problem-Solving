package org.raisinz.linkedList;

public class LinkedlistLastToFront {

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

    public void moveToFront(){
        if(head == null || head.next==null) return;
        Node secondLast=null;
        Node last=head;
        while (last.next != null){
            secondLast=last;
            last=last.next;
        }
        secondLast.next=null;
        last.next=head;
        head=last;
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

        LinkedlistLastToFront linkedlistLastToFront = new LinkedlistLastToFront();
        linkedlistLastToFront.inserNodeAtEnd(1);
        linkedlistLastToFront.inserNodeAtEnd(2);
        linkedlistLastToFront.inserNodeAtEnd(3);
        linkedlistLastToFront.inserNodeAtEnd(4);
        linkedlistLastToFront.inserNodeAtEnd(5);
        linkedlistLastToFront.moveToFront();
        linkedlistLastToFront.getList();

    }
}
