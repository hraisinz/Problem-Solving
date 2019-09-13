package org.raisinz.linkedList;

public class DoublyLinkedlistFindPairOfSum {

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

    public void findPairOfSum(int data){

        Node first=head;
        Node last=tail;
        boolean found=false;
        while(first != null && last != null && last.next != first && first != last){
            if((first.getData()+last.getData()) == data){
                found=true;
                System.out.println(first.getData()+","+last.getData() );
                first=first.getNext();
                last=last.getPrev();
            }
            else{
                if((first.getData()+last.getData())<data){
                    first=first.getNext();
                }
                else last=last.getPrev();
            }
        }
        if(found == false) System.out.println("Pair Not Found");
    }
    public static void main(String[] args) {
        DoublyLinkedlistFindPairOfSum doublyLinkedlistFindPairOfSum = new DoublyLinkedlistFindPairOfSum();
        doublyLinkedlistFindPairOfSum.insertAtEnd(1);
        doublyLinkedlistFindPairOfSum.insertAtEnd(2);
        doublyLinkedlistFindPairOfSum.insertAtEnd(3);
        doublyLinkedlistFindPairOfSum.insertAtEnd(4);
        doublyLinkedlistFindPairOfSum.insertAtEnd(5);
        doublyLinkedlistFindPairOfSum.insertAtEnd(6);
        doublyLinkedlistFindPairOfSum.insertAtEnd(7);
        doublyLinkedlistFindPairOfSum.insertAtEnd(8);
        doublyLinkedlistFindPairOfSum.insertAtEnd(9);
        doublyLinkedlistFindPairOfSum.insertAtEnd(10);
        int key=8;
        doublyLinkedlistFindPairOfSum.findPairOfSum(key);


    }
}
