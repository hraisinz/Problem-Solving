package org.raisinz.linkedList;

public class LinkedlistCountDuplicates {

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

    public int countDuplicates(){
        int count=0;
        while (head.getNext() != null){
            Node t=head.getNext();
            while (t.getNext() != null){
                if(head.getData() == t.getData()){
                    count++;
                    break;
                }
                t=t.getNext();
            }
            head=head.getNext();
        }
        return count;
    }
    public static void main(String[] args) {

        LinkedlistCountDuplicates linkedlistCountDuplicates = new LinkedlistCountDuplicates();
        linkedlistCountDuplicates.inserNodeAtEnd(10);
        linkedlistCountDuplicates.inserNodeAtEnd(20);
        linkedlistCountDuplicates.inserNodeAtEnd(10);
        linkedlistCountDuplicates.inserNodeAtEnd(20);
        linkedlistCountDuplicates.inserNodeAtEnd(40);
        linkedlistCountDuplicates.inserNodeAtEnd(20);
        System.out.println(linkedlistCountDuplicates.countDuplicates());
    }
}
