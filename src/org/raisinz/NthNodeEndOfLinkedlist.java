package org.raisinz;

public class NthNodeEndOfLinkedlist {

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


    public int getNthfromEnd(int n){
        int length=0;
        Node temp=head;

        while (temp != null){
            temp=temp.getNext();
            length++;
        }

        if(length<n || n==0){
            System.out.println("Invalid Position");
            return 0;
        }

        temp=head;
        for (int i = 1; i < (length-n+1) ; i++) {
            temp=temp.getNext();
        }
        return temp.getData();
    }

    public void getList(){
        Node temp=head;
        if(head == null){
            System.out.println("List is Empty");
        }
        while (temp != null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public static void main(String[] args) {

        NthNodeEndOfLinkedlist nthNodeEndOfLinkedlist = new NthNodeEndOfLinkedlist();
        nthNodeEndOfLinkedlist.inserNodeAtEnd(10);
        nthNodeEndOfLinkedlist.inserNodeAtEnd(20);
        nthNodeEndOfLinkedlist.inserNodeAtEnd(30);
        nthNodeEndOfLinkedlist.inserNodeAtEnd(40);
        nthNodeEndOfLinkedlist.inserNodeAtEnd(50);
        System.out.println(nthNodeEndOfLinkedlist.getNthfromEnd(3));

    }
}
