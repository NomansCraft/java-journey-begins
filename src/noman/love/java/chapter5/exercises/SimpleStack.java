package noman.love.java.chapter5.exercises;

public class SimpleStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public SimpleStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. cannot add new item.");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot remove item.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. No Item to show.");
            return -1;
        }
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Top item in the stack: " + stack.peek());

        while (stack.top >= 0) {
            int value = stack.pop();
            System.out.println("Popped item: " + value);
        }

        stack.pop();

    }
}
