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
    }
}
