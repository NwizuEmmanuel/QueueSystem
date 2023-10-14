import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        QueueOperations queueOperations = new QueueOperations();
        Scanner scanner = new Scanner(System.in);

//        console controls
        String controls = """
                1. Enqueue operation
                2. Dequeue operation
                3. Display operation
                4. Exit
                """;

        while (true) {
            System.out.println(controls);
            System.out.print("Enter your choice of operation: ");
            int choosenControl = scanner.nextInt();
//            control for enqueue
            if (choosenControl == 1) {
                System.out.print("Element to be inserted in the queue: ");
                int element = scanner.nextInt();
                queueOperations.enqueue(element);
//                control for dequeue
            } else if (choosenControl == 2) {
                queueOperations.dequeue();
//                control for displaying queue
            } else if (choosenControl == 3) {
                queueOperations.displayQueue();
//                kill switch
            } else if (choosenControl == 4) {
                System.out.println("Good bye.");
                break;
            } else {
                System.out.println("invalid operation.");
            }
        }
    }
}