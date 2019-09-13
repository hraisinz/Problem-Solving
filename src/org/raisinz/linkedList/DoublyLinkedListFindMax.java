package org.raisinz.linkedList;

public class DoublyLinkedListFindMax {
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

    public int findMax(){
        Node t=head;
        Node max=head;
        while (t != null){
            if(t.getData() > max.getData()){
                max=t;
            }
            t=t.getNext();
        }
        return max.getData();
    }


    public static void main(String[] args) {

        DoublyLinkedListFindMax doublyLinkedListFindMax = new DoublyLinkedListFindMax();
        doublyLinkedListFindMax.insertAtEnd(10);
        doublyLinkedListFindMax.insertAtEnd(200);
        doublyLinkedListFindMax.insertAtEnd(100);
        doublyLinkedListFindMax.insertAtEnd(125);
        doublyLinkedListFindMax.insertAtEnd(70);
        doublyLinkedListFindMax.insertAtEnd(5);
        System.out.println("Max : "+doublyLinkedListFindMax.findMax());


    }
}
