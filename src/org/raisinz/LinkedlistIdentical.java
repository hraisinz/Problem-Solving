package org.raisinz;

public class LinkedlistIdentical {

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

    public boolean checkIdentical(LinkedlistIdentical node){
        Node first=head;
        Node second=node.head;
        while (first != null && second != null){
            if(first.getData() != second.getData()) return false;
            first=first.getNext();
            second=second.getNext();
        }
        return (first == null && second == null);
    }


    private boolean checkIdenticalRecursive(Node first,Node second){

        if(first ==null && second ==null) return true;
        if(first != null && second != null) return (first.getData() == second.getData() && checkIdenticalRecursive(first.getNext(),second.getNext()));
        return false;
    }

    public boolean checkIdenticalList(LinkedlistIdentical list){

        return checkIdenticalRecursive(this.head,list.head);
    }

    public static void main(String[] args) {

        LinkedlistIdentical linkedlistIdentical1 = new LinkedlistIdentical();
        LinkedlistIdentical linkedlistIdentical2 = new LinkedlistIdentical();
        linkedlistIdentical1.inserNodeAtEnd(11);
        linkedlistIdentical1.inserNodeAtEnd(12);
        linkedlistIdentical1.inserNodeAtEnd(13);
        linkedlistIdentical2.inserNodeAtEnd(11);
        linkedlistIdentical2.inserNodeAtEnd(12);
        linkedlistIdentical2.inserNodeAtEnd(13);
        System.out.println(linkedlistIdentical1.checkIdentical(linkedlistIdentical2));
        System.out.println(linkedlistIdentical1.checkIdenticalList(linkedlistIdentical2));
    }
}
