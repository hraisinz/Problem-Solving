package org.raisinz.linkedList;

public class DoublyLinkedlistDeleteNodeFromEnd {

    private Node head;
    private Node tail;

    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
            this.next=null;
            this.prev=null;
        }

        public Node getPrev() {
            return prev;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        tail.next=null;

    }

    public void deleteNodeFromEnd(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=tail;
        if(head == tail){
            head=null;
        }
        else{
            tail.prev.next=null;
        }
        tail=tail.prev;
        temp.prev=null;
    }


    public void getList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while (temp != null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {

        DoublyLinkedlistDeleteNodeFromEnd doublyLinkedlistDeleteNodeFromEnd = new DoublyLinkedlistDeleteNodeFromEnd();
        doublyLinkedlistDeleteNodeFromEnd.insertAtEnd(10);
        doublyLinkedlistDeleteNodeFromEnd.insertAtEnd(20);
        doublyLinkedlistDeleteNodeFromEnd.insertAtEnd(30);
        doublyLinkedlistDeleteNodeFromEnd.insertAtEnd(40);
        doublyLinkedlistDeleteNodeFromEnd.insertAtEnd(50);
        doublyLinkedlistDeleteNodeFromEnd.deleteNodeFromEnd();
        doublyLinkedlistDeleteNodeFromEnd.deleteNodeFromEnd();
        doublyLinkedlistDeleteNodeFromEnd.getList();


    }
}
