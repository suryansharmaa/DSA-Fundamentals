class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node front, rear;
    int size;

    Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int value) {

        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int dequeue() {

        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return front.data;

    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    int getsize() {
        return size;
    }
}

public class queueLL {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue after enqueuing elements:");
        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Queue after dequeuing one element:");
        q.display();

        System.out.println("Front element: " + q.peek());

        System.out.println("Size of the queue: " + q.getsize());
    }
}
