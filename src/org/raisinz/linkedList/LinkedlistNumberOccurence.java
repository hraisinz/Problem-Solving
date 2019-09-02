package org.raisinz.linkedList;

public class LinkedlistNumberOccurence {

    private Node head;
    private Node tail;
    private int countRec;
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

    public int count(int num){

        Node current=head;
        int count=0;
        while (current != null){
            if(current.getData() == num){
                count++;
            }
            current=current.getNext();
        }
        return count;
    }

    public int countRecursive(int num){
        if(head == null) return countRec;
        if(head.data == num) countRec++;
        head=head.getNext();
        return countRecursive(num);
    }

    public static void main(String[] args) {

        LinkedlistNumberOccurence linkedlistNumberOccurence = new LinkedlistNumberOccurence();
        linkedlistNumberOccurence.inserNodeAtEnd(10);
        linkedlistNumberOccurence.inserNodeAtEnd(10);
        linkedlistNumberOccurence.inserNodeAtEnd(20);
        linkedlistNumberOccurence.inserNodeAtEnd(10);
        linkedlistNumberOccurence.inserNodeAtEnd(30);
        linkedlistNumberOccurence.inserNodeAtEnd(10);
        System.out.println(linkedlistNumberOccurence.count(10));
        System.out.println(linkedlistNumberOccurence.countRecursive(10));

    }
}
