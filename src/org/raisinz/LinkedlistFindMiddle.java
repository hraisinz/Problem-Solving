package org.raisinz;

public class LinkedlistFindMiddle {

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

    public int getMiddleNode(){
        Node p=head;
        Node q=head;
        while ( q != null && q.next!=null){
            p=p.next;
            q=q.next.next;
        }
        return p.getData();

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
        LinkedlistFindMiddle linkedlistFindMiddle = new LinkedlistFindMiddle();
        linkedlistFindMiddle.inserNodeAtEnd(10);
        linkedlistFindMiddle.inserNodeAtEnd(20);
        linkedlistFindMiddle.inserNodeAtEnd(30);
        linkedlistFindMiddle.inserNodeAtEnd(40);
        linkedlistFindMiddle.inserNodeAtEnd(50);
        System.out.println(linkedlistFindMiddle.getMiddleNode());

    }
}
