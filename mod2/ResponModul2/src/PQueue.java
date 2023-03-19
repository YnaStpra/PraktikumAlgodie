public class PQueue {
    Node front, rear, current, temp, priority;

    public void enQueue(String nama, int nilai){
        Node baru = new Node(nama, nilai);
        if (rear == null){
            front = rear = baru;
        }else {
            baru.prev = rear;
            rear.next = baru;
            rear = baru;
        }
    }

    public void deQueue(){
        if (front == null){
            return;
        }
        temp = front;
        front = front.next;
    }

    public void setPriority(int choose){
        current = front;
        while(current.next != null){
            if (current.next.nilai == choose){
                temp = current.next;
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void Priority(){
        if(priority == null){
            priority = temp;
            priority.next = front;
            front = priority;
        } else {
            temp.next = priority.next;
            priority.next = temp;
            priority = priority.next;
        }
    }

    public void display() {
        current = front;
        while (current != null) {
            System.out.print(current.nama+"("+current.nilai+")");
            if (current.next != null){
                System.out.print(", ");
            } else {
            System.out.print(".\n\n");
            }
            current = current.next;
        }
    }
}