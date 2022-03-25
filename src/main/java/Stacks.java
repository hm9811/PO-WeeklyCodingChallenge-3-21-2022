import java.util.Stack;

public class Stacks {
    public static void setUp(Stack<Object> stack ) {
        stack.push("v");
        stack.push("a");
        stack.push(1);
        System.out.println(stack);
    }

    public static void Pop(Stack<Object> stack) {
        if(stack == null) {
            throw new NullPointerException();
        }
        else
            stack.pop();
        System.out.println(stack);
    }

    public static void max(Stack<Object> stack) {
        int a = 0;
        if(stack == null) {
            throw new NullPointerException();
        }
        else {
            System.out.println(stack.peek());
        }
    }

    public static void main(String[] args) {
        Stack<Object> stack = new Stack<Object>();
        setUp(stack);
        Pop(stack);
        max(stack);
    }

}
