import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    Queue<Integer> queue = new LinkedList<>();

    public void enqueue(int element){
        queue.add(element);
    }

    public void dequeue(){
        try{
            int dequeueElement = queue.remove();
            System.out.println("Element deleted from queue: " + dequeueElement);
        }catch (Exception e){
            System.out.println("Queue's empty." + e.getMessage());
        }
    }

    public void displayQueue(){
        if (queue.isEmpty()){
            System.out.println("Queue's empty.");
        }else {
            System.out.println("Queue:");
            for (int i :
                    queue) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
