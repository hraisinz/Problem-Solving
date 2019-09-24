package org.raisinz.arrays;

public class CircularQueue {

    private int[] que;
    private int front;
    private int rear;

    public CircularQueue(int size){
        que=new int[size];
        front=-1;
        rear=-1;
    }

    boolean isEmpty(){
        if(front == -1 && rear== -1) return true;
        else return false;
    }

    boolean isFull(){
        if((rear+1) % que.length == front) return true;
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
        else rear=(rear+1)%que.length;

        que[rear]=v;
    }

    public int dequeue(){
        int temp;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else if(front == rear){
            temp=que[front];
            front=-1;
            rear=-1;
            return temp;
        }
        else {
            temp=que[front];
            front=(front+1)%que.length;
            return temp;
        }
    }

    public void getQueue(){
        if(front == -1 && rear== -1) {
            System.out.println("Queue is Empty");
            return;
        }
        if(rear>=front) {
            for (int i = front; i <= rear; i++) {
                System.out.println(que[i]);
            }
        }
        else{
            for (int i = front; i < que.length; i++) {
                System.out.println(que[i]);
            }
            for (int i = 0; i <=rear ; i++) {
                System.out.println(que[i]);
            }
        }
    }

    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enque(10);
        circularQueue.enque(20);
        circularQueue.enque(30);
        circularQueue.enque(40);
        circularQueue.enque(50);
        System.out.println("Dequeue Element : "+circularQueue.dequeue());
        circularQueue.getQueue();
        circularQueue.enque(10);
        System.out.println("Dequeue Element : "+circularQueue.dequeue());
        circularQueue.getQueue();
    }
}
