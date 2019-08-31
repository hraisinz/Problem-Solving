package org.raisinz;

public class LinkedlistLengthEvenOdd {

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

    public void checkLength(){
        Node temp=head;
        while (true){
            if(temp == null) {
                System.out.println("Even");
                break;
            }
            if(temp.getNext() == null){
                System.out.println("Odd");
                break;
            }
            temp=temp.getNext().getNext();
        }
    }
    public static void main(String[] args) {

        LinkedlistLengthEvenOdd linkedlistLengthEvenOdd = new LinkedlistLengthEvenOdd();
        linkedlistLengthEvenOdd.inserNodeAtEnd(10);
        linkedlistLengthEvenOdd.inserNodeAtEnd(20);
        linkedlistLengthEvenOdd.inserNodeAtEnd(30);
        linkedlistLengthEvenOdd.inserNodeAtEnd(50);
        linkedlistLengthEvenOdd.inserNodeAtEnd(60);
        linkedlistLengthEvenOdd.checkLength();
    }
}
