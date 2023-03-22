import java.util.Scanner;
import java.util.Random;

public class sortNsearch {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    Node head, tail, current, nodeNext = null;

    public void add(int data) {
        Node baru = new Node(data);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
            tail.next = null;
        }
    }

    public void swap(Node node1, Node node2) {
        int temp;
        temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    public void bubbleSort() {
        current = head;
        while (current != null) {
            nodeNext = current.next;
            while (nodeNext != null) {
                if (current.data >= nodeNext.data) {
                    swap(current, nodeNext);
                }
                nodeNext = nodeNext.next;
            }
            current = current.next;
        }
    }

    public void insertionSort() {
        current = head;
        while (current != tail) {
            nodeNext = current.next;
            if (current.data < nodeNext.data) {
                swap(current, nodeNext);
                while (current.prev != null) {
                    if (current.data > current.prev.data) {
                        swap(current, current.prev);
                    }
                    current = current.prev;
                }
            }
            current = current.next;
        }
    }

    public int nilaiMax(){
        current = head;
        int max = 0;
        while(current != tail){
            if(current.data >= max){
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int nilaiMin(){
        current = head;
        int min = 0;
        while(current != tail){
            if(current.data <= min){
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public void sequentialSearch(int data){
        current = head;
        while(current != null){
            if(current.data == data){
                System.out.println(current.data);
                break;
            }
            current = current.next;
        }
    }

    public Node findMid(Node first, Node last) {
        if (first == null) {
            return null;
        }
        Node run = first;
        Node faster = first.next;
        while (faster != last) {
            faster = faster.next;
            if (faster != last) {
                run = run.next;
                faster = faster.next;
            }
        }
        return run;
    }

    public void binarySearch(sortNsearch list, int search) {
        Node start = list.head;
        Node end = null;
        while(end != start){
            Node mid = findMid(start, end);
            if (mid.data == search){
                System.out.println(mid.data);
                return;
            } else if (mid.data <= search){
                start = mid.next;
            } else {
                end = mid;
            }
        }
    }

    public void display() {
        current = head;
        while (current != null) {
            if (current.next != null) {
                System.out.print(current.data + " --> ");
            } else {
                System.out.print(current.data);
            }
            current = current.next;
        }
    }
}