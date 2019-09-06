package org.raisinz.linkedList;

public class DoublyLinkedlistInsertNodeAtEnd {

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

    public void getReverseList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=null;
        Node current=head;
        while(current != null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp !=  null){
            head=temp.getPrev();
        }
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

        DoublyLinkedlistInsertNodeAtEnd doublyLinkedlistInsertNodeAtEnd = new DoublyLinkedlistInsertNodeAtEnd();
        doublyLinkedlistInsertNodeAtEnd.insertAtEnd(10);
        doublyLinkedlistInsertNodeAtEnd.insertAtEnd(20);
        doublyLinkedlistInsertNodeAtEnd.insertAtEnd(30);
        doublyLinkedlistInsertNodeAtEnd.insertAtEnd(40);
        doublyLinkedlistInsertNodeAtEnd.insertAtEnd(50);
        doublyLinkedlistInsertNodeAtEnd.insertAtEnd(60);
        doublyLinkedlistInsertNodeAtEnd.getReverseList();
        doublyLinkedlistInsertNodeAtEnd.getList();

    }
}
