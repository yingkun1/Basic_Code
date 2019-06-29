package testvector;

import java.util.Stack;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(4,4);
//        for (int i = 0; i < 23; i++) {
//            vector.add("a");
//            System.out.println(vector.size());
//            System.out.println(vector.capacity());
//            System.out.println("====================================================");
//        }
//        vector.add("a");
//        vector.add("b");
//        vector.add("c");
//        System.out.println(vector);
//        System.out.println(vector.get(0));
//        vector.remove(0);
//        vector.set(0,"z");
//        System.out.println(vector);
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
//        System.out.println(stack);
//        System.out.println(stack.size());
//        String pop = stack.pop();
//        System.out.println(pop);
//        String peek = stack.peek();
//        System.out.println(peek);
//        System.out.println(stack);
        System.out.println(stack.search("a"));
        System.out.println(stack.search("b"));
        System.out.println(stack.search("c"));
    }
}
