package Powerstar;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class WorkingWithCollections {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        Queue<String> q = new PriorityQueue<>();

        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        queue.offer("Hello");
        queue.add("World!");
        queue1.offer(2);
        System.out.println(queue);
        System.out.println(queue1.peek());
        System.out.println(queue.remove());
    }
}
