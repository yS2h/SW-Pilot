package step02;

public class RoadToBiodome08 {

    static final int MAX = 100;
    static int front = 0;
    static int rear = 0;
    static int[] queue = new int[MAX];

    public static void main(String[] args) {
        for (String s : args) {
            enqueue(Integer.parseInt(s));
        }

        while (!isEmpty()) {
            System.out.println("자원 " + peek() + "을 제공했습니다.");
            dequeue();
        }
        System.out.println("모든 요청이 처리되었습니다.");
    }


    public static boolean isEmpty() {
        return front == rear;
    }

    public static void enqueue(int value) {
        if (rear == MAX - 1) {
            System.out.println("Queue is Full");
            return;
        }
        queue[rear++] = value;
    }

    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front++];
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
}
