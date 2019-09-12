package org.raisinz.linkedList;

public class DoublyLinkedlistInsertNthPosition {

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


    public void insertNthPosition(int data,int position){
        Node node = new Node(data);
        int length = getLength();
        if(position > length+1 || position<1){
            System.out.println("Invalid Position");
            return;

        }
        if(head == null){
            if(position != 1){
                System.out.println("Invalid Position");
                return;
            }else{
                head=node;
                node.prev=head;
                return;
            }
        }
        if(head != null && position == 1){
            node.next=head;
            head.next.prev=node;
            head=node;
            node.prev=head;
            return;
        }

        Node current=head;
        Node previous=null;
        int n=1;
        while (n<position){
            previous=current;
            current=current.getNext();
            if(current == null){
                node.prev=previous;
                previous.next=node;
                return;
            }
            n++;
        }
        node.next=current;
        current.prev=node;
        previous.next=node;
        node.prev=previous;

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

        DoublyLinkedlistInsertNthPosition doublyLinkedlistInsertNthPosition = new DoublyLinkedlistInsertNthPosition();
        doublyLinkedlistInsertNthPosition.insertAtEnd(10);
        doublyLinkedlistInsertNthPosition.insertAtEnd(20);
        doublyLinkedlistInsertNthPosition.insertAtEnd(30);
        doublyLinkedlistInsertNthPosition.insertAtEnd(40);
        doublyLinkedlistInsertNthPosition.insertAtEnd(50);
        doublyLinkedlistInsertNthPosition.insertAtEnd(60);
        doublyLinkedlistInsertNthPosition.insertNthPosition(111,7);
        doublyLinkedlistInsertNthPosition.insertNthPosition(111,9);
        doublyLinkedlistInsertNthPosition.getList();
    }
}
