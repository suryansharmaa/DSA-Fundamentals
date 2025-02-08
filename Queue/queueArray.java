class Queue {
    int[] queue;
    int front, rear, size;
    static final int capacity = 5;

    public Queue() {
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = rear + 1;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int dequeuedElement = queue[front];
        front = front + 1;
        size--;
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + " ");
            i++;
        }
        System.out.println();
    }

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

        System.out.println("Size of the queue: " + q.getSize());
    }
}
