package August.ex_24082024;

//Queqe Concept

import java.util.PriorityQueue;

public class Lab224 {
    public static void main(String[] args) {
        // Queue - < 1% in Automation

        PriorityQueue pq= new PriorityQueue();
        pq.offer("1"); // offer is same as the add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek()); // it will pick the first element
        System.out.println(pq.poll()); // Remove the 1st element
        System.out.println(pq);


    }
}
