package org.raisinz;

public class LinkedListNthPosition {
    private Node head;

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

    public void insertNode(int data, int position){

        Node node = new Node(data);

        int size = getSize();
        if(position > size+1 || position<1){
            System.out.println("Invalid Position");
            return;
        }
        if(head == null){
            if(position != 1){
                System.out.println("Invalid Position");
                return;
            }else{
                head=node;
                return;
            }
        }

        if(head != null && position == 1){
            node.next=head;
            head=node;
            return;
        }

         Node current = head;
         Node previous = null;
         int n = 1;
         while (n < position) {
             previous = current;
             current = current.next;
             if (current == null) break;
             n++;
            }
            node.next = current;
            previous.next = node;
    }

    public void getList() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }


    public static void main(String[] args) {

        LinkedListNthPosition linkedListNthPosition = new LinkedListNthPosition();
        linkedListNthPosition.insertNode(32,1);
        linkedListNthPosition.insertNode(33,2);
        linkedListNthPosition.insertNode(34,3);
        linkedListNthPosition.insertNode(35,4);
        linkedListNthPosition.insertNode(36,3);
        linkedListNthPosition.getList();

    }
}
