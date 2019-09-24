package org.raisinz.arrays;

public class QueueUsingLinkedlist {
    private Node front;
    private Node rear;

    public QueueUsingLinkedlist(){
        front=null;
        rear=null;
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public void enqueue(int data){

        Node node = new Node(data);
        if(rear == null){
            this.front=node;
            this.rear=node;
            return;
        }
        this.rear.next=node;
        this.rear=node;

    }

    public int dequeue(){
        if(front == null) return 0;
        Node temp=front;
        front=front.getNext();
        if(front == null) this.rear=null;
        return temp.getData();
    }

    public void getQueue(){
        if(front == null && rear == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp=front;
        while (temp != null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {

        QueueUsingLinkedlist queueUsingLinkedlist = new QueueUsingLinkedlist();
        queueUsingLinkedlist.enqueue(10);
        queueUsingLinkedlist.enqueue(20);
        queueUsingLinkedlist.enqueue(30);
        queueUsingLinkedlist.enqueue(40);
        queueUsingLinkedlist.enqueue(50);
        System.out.println("Dequeue Element : "+queueUsingLinkedlist.dequeue());
        queueUsingLinkedlist.enqueue(60);
        queueUsingLinkedlist.getQueue();
    }
}
