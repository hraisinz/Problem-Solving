package org.raisinz;

public class LinkedlistSearchElement {

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

    public boolean searchElement(int element){
        Node current=head;
        while (current != null){
            if(current.data==element) return true;
            current=current.next;
        }
        return false;
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

        LinkedlistSearchElement linkedlistSearchElement = new LinkedlistSearchElement();
        linkedlistSearchElement.inserNodeAtEnd(10);
        linkedlistSearchElement.inserNodeAtEnd(20);
        linkedlistSearchElement.inserNodeAtEnd(30);
        linkedlistSearchElement.inserNodeAtEnd(40);
        linkedlistSearchElement.inserNodeAtEnd(50);
        System.out.println(linkedlistSearchElement.searchElement(30));

    }
}
