interface QueueImpl {
    void insert(int item);
    int delete();
    void display();
}

class QueueDemo implements QueueImpl {
    private int[] queue = new int[10];
    private int size = 0;

    @Override
    public void insert(int item) {
        if (size == 10) {
            System.out.println("Queue Overflow: The bus stand is full!");
        } else {
            queue[size] = item;
            size++;
            System.out.println("Person " + item + " joined the queue.");
        }
    }

    public int delete() {
        if (size == 0) {
            System.out.println("Queue Underflow: No one is in line.");
            return -1; // Returning -1 to indicate an empty queue
        } else {
            int boughtTicket = queue[0];
            
            // Shifting everyone one step forward
            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }
            
            size--;
            return boughtTicket;
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueOpration {
    public static void main(String[] args) {
        QueueDemo busStand = new QueueDemo();

        // 1. Adding people to the queue
        busStand.insert(10);
        busStand.insert(20);
        busStand.insert(30);
        busStand.display();

        // 2. Deleting a person from the queue (simulating ticket purchase)
        int boughtTicket = busStand.delete();
        System.out.println("Person " + boughtTicket + " bought a ticket and left the queue.");
        busStand.display();

    }
}