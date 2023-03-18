public class respon {
    class Node{
        int obj;
        Node next;
        Node(int obj){
            this.obj = obj;
        }
    }
    Node head;
    Node tail;
    public void AddLast(int obj){
        Node baru = new Node(obj);
        if(isEmpty()){
            head = tail = baru;
        }else{
            tail.next = baru;
            tail=baru;
        }
    }

    public void connected(respon respon){
        tail.next = respon.head;
        sorting();
    }
    void sorting() {
        Node current = head;
        Node temp;
        temp = current.next;
        while (current != null) {
            if (temp.obj < current.obj) {
                int sort;
                sort = current.obj;
                current.obj = temp.obj;
                temp.obj = sort;
            }
            if (temp.next != null) {
                temp = temp.next;
            }
            current = current.next;

        }
    }

    void printAll(){
        Node node = head;
        while (true) {
            if (node != null) {
                System.out.print(" -> "+node.obj);
                node = node.next;
            } else
                break;
        }
    }
    protected boolean isEmpty(){
        return(head==null&&tail==null);
    }
}
