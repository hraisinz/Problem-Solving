package org.raisinz.linkedList;

public class LinkedlistTimeComplexity {

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

        LinkedlistTimeComplexity linkedlistTimeComplexity = new LinkedlistTimeComplexity();
        linkedlistTimeComplexity.inserNodeAtEnd(10);
        linkedlistTimeComplexity.inserNodeAtEnd(20);
        linkedlistTimeComplexity.inserNodeAtEnd(30);
        linkedlistTimeComplexity.inserNodeAtEnd(40);
        linkedlistTimeComplexity.getList();
    }
}
