package org.raisinz;

public class IndexedSearchingList {

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

    public int searchIndex(int index){
        Node current=head;
        int count=1;
        while (current != null){
            if(count == index) return current.getData();
            count++;
            current=current.next;
        }
        return 0;
    }

    public static void main(String[] args) {

        IndexedSearchingList indexedSearchingList = new IndexedSearchingList();
        indexedSearchingList.inserNodeAtEnd(10);
        indexedSearchingList.inserNodeAtEnd(20);
        indexedSearchingList.inserNodeAtEnd(30);
        indexedSearchingList.inserNodeAtEnd(40);
        indexedSearchingList.inserNodeAtEnd(50);
        System.out.println(indexedSearchingList.searchIndex(3));
    }
}
