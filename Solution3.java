
public class Solution3 {
    private int[] queue;
    private int head;
    private int tail;
    private int capacity;

    public Solution3(int k) {
        capacity = k + 1; 
        queue = new int[capacity];
        head = 0;
        tail = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            return false; 
        }
        queue[tail] = value;
        tail = (tail + 1) % capacity; 
        return true;
    }

    
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty"); 
        }
        int value = queue[head];
        head = (head + 1) % capacity; 
        return value;
    }

    
    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty"); 
        }
        return queue[head];
    }

    
    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty"); 
        }
        return queue[(tail - 1 + capacity) % capacity]; 
    }

    
    public boolean isEmpty() {
        return head == tail;
    }

    
    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }

    public static void main(String[] args) {
        Solution3 q = new Solution3(3);
        System.out.println(q.enqueue(1)); // True
        System.out.println(q.enqueue(2)); // True
        System.out.println(q.enqueue(3)); // True
        System.out.println(q.dequeue());  // 1
        System.out.println(q.enqueue(4)); // True
        System.out.println(q.front());    // 2
        System.out.println(q.rear());     // 4
    }
}
