class Stack {
    Stack() {
        top = -1;
    }

    static final int max = 2;
    int top;
    int[] a = new int[max];

    boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top >= max - 1) {
            return true;
        }
        return false;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top += 1;
        a[top] = x;
        System.out.println("Pushed " + x);
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = a[top];
        top -= 1;
        return x;
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        int x = a[top];

        return x;
    }
}

public class stackArray {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.pop();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element : " + s.peek());
        System.out.println(s.pop() + " Popped");
        System.out.println("Top element : " + s.peek());

    }
}
