package org.raisinz.linkedList;

public class DoublyLinkedlistReverse {

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

    private int getLengthRecursive(Node node){
        if(node == null) return 0;
        return 1+getLengthRecursive(node.next);
    }

    public int getLength(){
        return getLengthRecursive(head);
    }

    public void reverse() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
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

        DoublyLinkedlistReverse doublyLinkedlistReverse = new DoublyLinkedlistReverse();
        doublyLinkedlistReverse.insertAtEnd(10);
        doublyLinkedlistReverse.insertAtEnd(20);
        doublyLinkedlistReverse.insertAtEnd(30);
        doublyLinkedlistReverse.insertAtEnd(40);
        doublyLinkedlistReverse.insertAtEnd(50);
        doublyLinkedlistReverse.insertAtEnd(60);
        doublyLinkedlistReverse.reverse();
        doublyLinkedlistReverse.getList();

    }
}
