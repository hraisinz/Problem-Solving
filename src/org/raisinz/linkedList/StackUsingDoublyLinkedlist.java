package org.raisinz.linkedList;

public class StackUsingDoublyLinkedlist {

    private Node head;

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

    public void push(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
            return;
        }
        head.prev=node;
        node.next=head;
        head=node;
    }

    public int pop(){
        if(head== null){
            System.out.println("List is Empty");
            return -1;
        }
        Node temp=head;
        head=head.getNext();
        head.prev=null;
        return temp.getData();
    }

    public void getStack(){
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
        StackUsingDoublyLinkedlist stackUsingDoublyLinkedlist = new StackUsingDoublyLinkedlist();
        stackUsingDoublyLinkedlist.push(10);
        stackUsingDoublyLinkedlist.push(20);
        stackUsingDoublyLinkedlist.push(30);
        stackUsingDoublyLinkedlist.push(40);
        stackUsingDoublyLinkedlist.push(50);
        stackUsingDoublyLinkedlist.push(60);
        System.out.println("popped element : "+stackUsingDoublyLinkedlist.pop());
        stackUsingDoublyLinkedlist.getStack();
    }
}
