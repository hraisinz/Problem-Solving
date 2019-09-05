package org.raisinz.linkedList;

public class DoublyLinkedlistFindMiddle {

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
        DoublyLinkedlistFindMiddle doublyLinkedlistFindMiddle = new DoublyLinkedlistFindMiddle();
        doublyLinkedlistFindMiddle.insertAtEnd(10);
        doublyLinkedlistFindMiddle.insertAtEnd(20);
        doublyLinkedlistFindMiddle.insertAtEnd(30);
        doublyLinkedlistFindMiddle.insertAtEnd(40);
        doublyLinkedlistFindMiddle.insertAtEnd(50);
        System.out.println("Middle is : "+doublyLinkedlistFindMiddle.getMiddleNode());
    }
}
