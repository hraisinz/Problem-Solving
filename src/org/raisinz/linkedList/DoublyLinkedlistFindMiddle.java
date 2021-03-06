package org.raisinz.linkedList;

public class DoublyLinkedlistFindMiddle {

    private Node head;
    private Node tail;

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

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        tail.next=null;

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

    private int getMiddleRec(Node p,Node q){
        if(q == null || q.getNext() == null) return p.getData();
        p=p.getNext();
        q=q.next.next;
        return getMiddleRec(p,q);
    }

    public int getMiddleNodeRecursive(){
        if(head == null)
        {
            System.out.println("List is Empty");
            return 0;
        }
        return getMiddleRec(head,head);
    }

    public void getList(){
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

    private void getListRec(Node temp){
        if(temp == null) return;
        System.out.println(temp.getData());
        temp=temp.getNext();
        getListRec(temp);
    }

    public void getListRecursive(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        getListRec(head);
    }


    public static void main(String[] args) {
        DoublyLinkedlistFindMiddle doublyLinkedlistFindMiddle = new DoublyLinkedlistFindMiddle();
        doublyLinkedlistFindMiddle.insertAtEnd(10);
        doublyLinkedlistFindMiddle.insertAtEnd(20);
        doublyLinkedlistFindMiddle.insertAtEnd(30);
        doublyLinkedlistFindMiddle.insertAtEnd(40);
        doublyLinkedlistFindMiddle.insertAtEnd(50);
        System.out.println("Middle is : "+doublyLinkedlistFindMiddle.getMiddleNode());
        System.out.println("Middle Element using recursion : "+doublyLinkedlistFindMiddle.getMiddleNodeRecursive());
        System.out.println("Getting list using recursion");
        doublyLinkedlistFindMiddle.getListRecursive();
    }
}
