package org.raisinz;

public class LinkedListDeleteNode {

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


    public void deleteFromBegining(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else if(head != tail){
            head=head.next;
        }
        else{
            head=null;
            tail=null;
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

        LinkedListDeleteNode linkedListDeleteNode = new LinkedListDeleteNode();
        linkedListDeleteNode.inserNodeAtEnd(10);
        linkedListDeleteNode.inserNodeAtEnd(20);
        linkedListDeleteNode.inserNodeAtEnd(30);
        linkedListDeleteNode.inserNodeAtEnd(40);
        linkedListDeleteNode.getList();
        linkedListDeleteNode.deleteFromBegining();
        System.out.println("\n");
        linkedListDeleteNode.getList();
    }
}
