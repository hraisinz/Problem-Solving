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
        Node t1=head;
        while (t1.getNext() != null){
            Node t=t1.getNext();
            while (t.getNext() != null){
                if(t1.getData() == t.getData()){
                    count++;
                    break;
                }
                t=t.getNext();
            }
            t1=t1.getNext();
        }
        return count;
    }

    public int sumOfNonDuplicateNode(){
        Node t1=head;
        Node t2;
        int sum=0;
        while (t1 != null){
            t2=head;
            boolean flag=false;
            while (t2 != null){
                if(t1!=t2 && t1.getData() == t2.getData()){
                    flag=true;
                    break;
                }
                t2=t2.getNext();
            }

            if(!flag){
                sum=sum+t1.getData();
            }
            t1=t1.getNext();
        }
        return sum;
    }

    public int sumOfNextGreaterNode(){

        if(head == null){
            return 0;
        }
        int sum=0;
        Node t2=head;
        while (t2.getNext() != null){
            if(t2.getData() > t2.getNext().getData()){
                sum=sum+t2.getData();
            }
            t2=t2.getNext();
        }
        if(t2.getData() > head.getData()){
            sum=sum+t2.getData();
        }
        return sum;
    }
    public static void main(String[] args) {

        LinkedlistCountDuplicates linkedlistCountDuplicates = new LinkedlistCountDuplicates();
        linkedlistCountDuplicates.inserNodeAtEnd(10);
        linkedlistCountDuplicates.inserNodeAtEnd(20);
        linkedlistCountDuplicates.inserNodeAtEnd(10);
        linkedlistCountDuplicates.inserNodeAtEnd(30);
        linkedlistCountDuplicates.inserNodeAtEnd(40);
        linkedlistCountDuplicates.inserNodeAtEnd(20);
        System.out.println(linkedlistCountDuplicates.countDuplicates());
        System.out.println(linkedlistCountDuplicates.sumOfNonDuplicateNode());
        LinkedlistCountDuplicates linkedlistCountDuplicates1 = new LinkedlistCountDuplicates();
        linkedlistCountDuplicates1.inserNodeAtEnd(9);
        linkedlistCountDuplicates1.inserNodeAtEnd(2);
        linkedlistCountDuplicates1.inserNodeAtEnd(3);
        linkedlistCountDuplicates1.inserNodeAtEnd(5);
        linkedlistCountDuplicates1.inserNodeAtEnd(4);
        linkedlistCountDuplicates1.inserNodeAtEnd(6);
        linkedlistCountDuplicates1.inserNodeAtEnd(8);
        System.out.println(linkedlistCountDuplicates1.sumOfNextGreaterNode());

    }
}
