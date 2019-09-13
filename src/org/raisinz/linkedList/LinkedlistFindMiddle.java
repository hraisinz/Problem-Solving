package org.raisinz.linkedList;

public class LinkedlistFindMiddle {

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

    public int getMiddleNode(){
        Node p=head;
        Node q=head;
        while ( q != null && q.next!=null){
            p=p.next;
            q=q.next.next;
        }
        return p.getData();

    }

    private int getMiddleRecursive(Node p,Node q){
        if(q == null || q.next == null){
            return p.getData();
        }
        p=p.getNext();
        q=q.next.next;
        return getMiddleRecursive(p,q);
    }

    public int getMiddleNodeRecursive(){
        return getMiddleRecursive(head,head);
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

    private void getListRecursive(Node temp){
        if(temp == null) return;
        System.out.println(temp.getData());
        temp=temp.getNext();
        getListRecursive(temp);
    }

    public void getListRec(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        getListRecursive(head);
    }
    public static void main(String[] args) {
        LinkedlistFindMiddle linkedlistFindMiddle = new LinkedlistFindMiddle();
        linkedlistFindMiddle.inserNodeAtEnd(10);
        linkedlistFindMiddle.inserNodeAtEnd(20);
        linkedlistFindMiddle.inserNodeAtEnd(30);
        linkedlistFindMiddle.inserNodeAtEnd(40);
        linkedlistFindMiddle.inserNodeAtEnd(50);
        linkedlistFindMiddle.inserNodeAtEnd(60);
        System.out.println(linkedlistFindMiddle.getMiddleNode());
        System.out.println("Get the Middle Node Recursively : "+linkedlistFindMiddle.getMiddleNodeRecursive());
        System.out.println("Getting List using recursion :");
        linkedlistFindMiddle.getListRec();
    }
}
