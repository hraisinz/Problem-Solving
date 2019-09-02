package org.raisinz.linkedList;

public class LinkedListDeleteNode {

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


    public void deleteFromBegining(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else if(head != tail){
            head=head.next;
        }
        else{
            head=null;
            tail=null;
        }
    }


    public void deleteFromLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else if(head != tail){
            Node current=head;
            while (current.getNext() != tail){
                current=current.getNext();
            }
            tail=current;
            tail.next=null;
        }
        else{
            head=null;
            tail=null;
        }
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

    public void deleteFromMiddle(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            Node temp;
            Node current;
            int size=getSize();
            int count=(size % 2 == 0)?(size/2):((size+1)/2);
            if(head != tail){
                temp=head;
                current=null;
                for (int i = 0; i < count-1; i++) {
                    current=temp;
                    temp=temp.getNext();
                }
                if(current != null){
                    current.next=temp.next;
                    temp=null;
                }
                else{
                    head=temp.next;
                    tail=temp.next;
                    temp=null;
                }
            }else{
                head=null;
                tail=null;
            }
        }
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

        LinkedListDeleteNode linkedListDeleteNode = new LinkedListDeleteNode();
        linkedListDeleteNode.inserNodeAtEnd(10);
        linkedListDeleteNode.inserNodeAtEnd(20);
        linkedListDeleteNode.inserNodeAtEnd(30);
        linkedListDeleteNode.inserNodeAtEnd(40);
        linkedListDeleteNode.inserNodeAtEnd(50);
        linkedListDeleteNode.inserNodeAtEnd(60);
        linkedListDeleteNode.getList();
        linkedListDeleteNode.deleteFromBegining();
        linkedListDeleteNode.deleteFromLast();
        linkedListDeleteNode.deleteFromLast();
        System.out.println("\n");
        linkedListDeleteNode.getList();
        linkedListDeleteNode.deleteFromMiddle();
        System.out.println("\n");
        linkedListDeleteNode.getList();

    }
}
