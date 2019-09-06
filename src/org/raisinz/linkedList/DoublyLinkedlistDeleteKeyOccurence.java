package org.raisinz.linkedList;

public class DoublyLinkedlistDeleteKeyOccurence {

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

    private void deleteNode(Node current){
        if(current == null) return;
        if(current == head) head=current.next;
        if(current.next != null) current.next.prev=current.prev;
        if(current.prev != null) current.prev.next=current.next;
    }

    public void deleteAllOccurenceOfKey(int x){
        if(head == null){
            return;
        }
        Node current=head;
        while (current != null){
            if(current.getData() == x){
                deleteNode(current);
            }
            current=current.getNext();
        }
    }

    public static void main(String[] args) {

        DoublyLinkedlistDeleteKeyOccurence doublyLinkedlistDeleteKeyOccurence = new DoublyLinkedlistDeleteKeyOccurence();
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(1);
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(2);
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(3);
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(4);
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(3);
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(5);
        doublyLinkedlistDeleteKeyOccurence.insertAtEnd(3);
        int deleteKey=3;
        doublyLinkedlistDeleteKeyOccurence.deleteAllOccurenceOfKey(deleteKey);
        doublyLinkedlistDeleteKeyOccurence.getList();

    }
}
