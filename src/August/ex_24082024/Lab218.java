package August.ex_24082024;

import java.util.Stack;

public class Lab218 {
    public static void main(String[] args) {
        // Vector, Stack - Legacy - 95% of time we are not going to use it in automation

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit"); // Push is same as add method and push internally calls add
        s.add("Amit2");
        System.out.println(s); // O/P: [Pramod, Dutta, Amit, Amit2]
        System.out.println(s.peek()); // Amit2
        System.out.println(s.pop()); // Amit2

        System.out.println(s); // [Pramod, Dutta, Amit]
    }
}
