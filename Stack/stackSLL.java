class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackList {

    Node head;

    StackList() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Pushed : " + data);
    }

    void pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        head = head.next;
        System.out.println("Popped");
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

}

public class stackSLL {
    public static void main(String[] args) {
        StackList s = new StackList();

        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);

        System.out.println("Top element : " + s.peek());
        s.pop();
        s.pop();
        System.out.println("New top element : " + s.peek());

    }
}