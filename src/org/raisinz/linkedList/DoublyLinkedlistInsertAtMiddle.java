package org.raisinz.linkedList;

public class DoublyLinkedlistInsertAtMiddle {

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

    public int getSize(){
        if(head == null){
            return 0;
        }
        int count=0;
        Node current=head;
        while (current != null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void insertNodeAtMiddle(int data){

        Node node=new Node(data);
        if(head == null){
            head=node;
            tail=node;
        }
        else{
            int size=getSize();
            int count=(size % 2 ==0)?(size/2) : ((size+1)/2);
            Node temp=head;
            Node current=null;
            for (int i = 0; i < count; i++) {
                current=temp;
                temp=temp.next;
            }
            node.next=current.next;
            temp.prev=node;
            current.next=node;
            node.prev=current;

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

        DoublyLinkedlistInsertAtMiddle doublyLinkedlistInsertAtMiddle = new DoublyLinkedlistInsertAtMiddle();
        doublyLinkedlistInsertAtMiddle.insertAtEnd(10);
        doublyLinkedlistInsertAtMiddle.insertAtEnd(20);
        doublyLinkedlistInsertAtMiddle.insertAtEnd(30);
        doublyLinkedlistInsertAtMiddle.insertAtEnd(40);
        doublyLinkedlistInsertAtMiddle.insertNodeAtMiddle(55);
        doublyLinkedlistInsertAtMiddle.getList();


    }
}
