package org.raisinz.arrays;

public class Queue {

    private int[] que;
    private int front;
    private int rear;

    public Queue(int size){
        que=new int[size];
        front=-1;
        rear=-1;
    }

    boolean isEmpty(){
        if(front == -1 && rear== -1) return true;
        else return false;
    }

    boolean isFull(){
        if(rear == que.length-1) return true;
        else return false;
    }
    public void enque(int v){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else if(isEmpty()){
            front=0;
            rear=0;
        }
        else{
            rear++;
        }
        que[rear]=v;
    }

    public int dequeue(){
        int temp;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else if( front == rear){
            temp=que[front];
            front=-1;
            rear=-1;
            return temp;
        }
        else {
            temp=que[front];
            front++;
            return temp;
        }
    }

    public void getQueue(){
        if(front == -1 && rear== -1) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <=rear ; i++) {
            System.out.println(que[i]);
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue(10);
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.enque(40);
        System.out.println("Dequeue Element : "+queue.dequeue());
        queue.getQueue();
    }
}
