package JavaCollection;
import java.util.PriorityQueue;

/*
*in java a priorityQueue is an implementation of the queue interface that provides a priority based order of elements.
* elements is a priority queue are ordered to their natural ordering(if they implement the comparable interface) or by comparator provided at
* construction time.
* priority is determined by the comparison function or the natural ordering of the elements.
*
* poll() retrieves highest priority elements
* peak() retrieves highest priority elements without removing it from the queue
* offer(element) adds an element to the priorityqueue
*/

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.offer(5);
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);
        pq.offer(1);
        pq.offer(9);

        System.out.println("elements in ascending order: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
            System.out.println("-----------");
            System.out.println(pq.peek() + " ");

        }
    }
}

