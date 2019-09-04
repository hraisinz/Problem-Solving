package org.raisinz.linkedList;

public class ReverseLinkedlistUsingStack {

    private Node head;
    private Node tail;

    class Node{
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



    static class Stack{
        private int top;
        private Node[] stk;

        public Stack(int size){
            stk=new Node[size];
            top=size;
        }

        public void push(Node node){
            if(top == 0){
                System.out.println("stack overflow");
            }
            else{
                stk[--top]=node;
            }
        }

        public Node pop(){
            if(top == stk.length){
                System.out.println("Stack Underflow");
                return null;
            }
            else{
                return stk[++top-1];
            }
        }

        boolean isEmpty(){
            if(top == stk.length) return true;
            return false;
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

    public void reverseList(Stack stack){
        Node temp=head;
        while (temp != null){
            stack.push(temp);
            temp=temp.getNext();
        }

        temp = stack.pop();
        head=temp;
        while (!stack.isEmpty()){
           temp.next=stack.pop();
           temp=temp.next;
        }
        temp.next=null;
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

        ReverseLinkedlistUsingStack reverseLinkedlistUsingStack = new ReverseLinkedlistUsingStack();

        reverseLinkedlistUsingStack.inserNodeAtEnd(10);
        reverseLinkedlistUsingStack.inserNodeAtEnd(20);
        reverseLinkedlistUsingStack.inserNodeAtEnd(30);
        reverseLinkedlistUsingStack.inserNodeAtEnd(40);
        reverseLinkedlistUsingStack.inserNodeAtEnd(50);
        int size = reverseLinkedlistUsingStack.getSize();
        reverseLinkedlistUsingStack.reverseList(new Stack(size));
        reverseLinkedlistUsingStack.getList();
    }
}

