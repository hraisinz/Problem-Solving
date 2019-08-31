package org.raisinz;

public class LinkedlistLoopCreation {

    private Node head;
    private Node tail;

    private class Node{
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next=null;
        }

        private int getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }

        private Node getNext() {
            return next;
        }
    }

    public void inserNodeAtEnd(int data){
        Node node = new Node(data);
        if(head == null) {
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }


    public void createLoop(int k){

        Node p=head;
        if(k == 0 || k > getSize() ){
            System.out.println("Invalid Position");
            return;
        }
        while (p.getNext() != null){
            System.out.println(p.getData());
            p=p.getNext();
        }
        Node temp=head;
        for (int i = 1; i < k; i++) {
            temp=temp.getNext();
        }
        p.setNext(temp);
    }

    public boolean ifLoopExists(){
        Node fast=head;
        Node slow=head;
        while (fast != null && fast.getNext() != null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();
            if(slow == fast) return true;
        }
        return false;
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
    public static void main(String[] args) {

        LinkedlistLoopCreation linkedlistLoopCreation = new LinkedlistLoopCreation();
        linkedlistLoopCreation.inserNodeAtEnd(10);
        linkedlistLoopCreation.inserNodeAtEnd(20);
        linkedlistLoopCreation.inserNodeAtEnd(30);
        linkedlistLoopCreation.inserNodeAtEnd(40);
        linkedlistLoopCreation.inserNodeAtEnd(50);
        linkedlistLoopCreation.createLoop(4);
        System.out.println(linkedlistLoopCreation.ifLoopExists());
    }
}
