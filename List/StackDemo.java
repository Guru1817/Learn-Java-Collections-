package List;

import java.util.Stack;
public class StackDemo {


    public static void main(String[] args) {

        Stack<Object> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
