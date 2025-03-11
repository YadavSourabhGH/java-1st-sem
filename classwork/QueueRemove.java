import java.util.*;
public class QueueRemove 
{
    public static void main(String[] args)
    {
        Queue <String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Remove (remove) :" + queue.remove());
        System.out.println("Remove (remove) :" + queue.poll());

        queue.clear();

        System.out.println("Poll on empty queue: " + queue.poll());
    }
}