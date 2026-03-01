import java.util.Stack;

class MinStack {
    // Using Two Stacks
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // Push to minStack; if it's empty or val is the new minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            // Push the same top value again to maintain sync
            minStack.push(minStack.peek());
        }
    }

    // Pop the elements
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // output: -3
        minStack.pop();
        System.out.println(minStack.top()); // output: 0
        System.out.println(minStack.getMin()); // output: -2
    }
}