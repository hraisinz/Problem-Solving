package org.raisinz;

public class LinkedlistFindLength {

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


    private int getLengthRecursive(Node node){

        if(node == null) return 0;
        return 1+getLengthRecursive(node.next);
    }

    public int getLength(){
        return getLengthRecursive(head);
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

        LinkedlistFindLength linkedlistFindLength = new LinkedlistFindLength();
        linkedlistFindLength.inserNodeAtEnd(10);
        linkedlistFindLength.inserNodeAtEnd(20);
        linkedlistFindLength.inserNodeAtEnd(30);
        linkedlistFindLength.inserNodeAtEnd(40);
        linkedlistFindLength.inserNodeAtEnd(50);
        System.out.println(linkedlistFindLength.getLength());
    }
}
