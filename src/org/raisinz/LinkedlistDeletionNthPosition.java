package org.raisinz;

public class LinkedlistDeletionNthPosition {

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

    public void deleteNodeAtNth(int position){

        int size = getSize();
        Node temp=head;

        if(position > size || position<1){
            System.out.println("Invalid Position");
            return;
        }

        if(head == null) return;

        if(position == 1){
            head=temp.next;
            return;
        }
        for (int i = 1; temp != null && i<position-1 ; i++){
            temp=temp.getNext();
        }

        if(temp == null || temp.next==null) return;

        Node next=temp.next.next;
        temp.next=next;

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

        LinkedlistDeletionNthPosition linkedlistDeletionNthPosition = new LinkedlistDeletionNthPosition();
        linkedlistDeletionNthPosition.inserNodeAtEnd(10);
        linkedlistDeletionNthPosition.inserNodeAtEnd(20);
        linkedlistDeletionNthPosition.inserNodeAtEnd(30);
        linkedlistDeletionNthPosition.inserNodeAtEnd(40);
        linkedlistDeletionNthPosition.deleteNodeAtNth(2);
        linkedlistDeletionNthPosition.deleteNodeAtNth(1);
        linkedlistDeletionNthPosition.getList();
    }
}
