package MinStack;


import java.util.Stack;

public class MinStack {

    Stack<Pair<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair<>(val, val));
        } else {
            int minVal = Math.min(val, stack.peek().second);
            stack.push(new Pair<>(val, minVal));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().first;
    }

    public int getMin() {
        return stack.peek().second;
    }
}

class Pair<K, V> {
    K first;
    V second;

    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}

