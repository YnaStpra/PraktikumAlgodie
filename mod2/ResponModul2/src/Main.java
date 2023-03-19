public class Main {
    public static void main(String[] args) {
        PQueue que = new PQueue();
        System.out.println("====Antrian Awal====");
        que.enQueue("Jordan", 78);
        que.enQueue("Kalia", 72);
        que.enQueue("Erfan", 74);
        que.enQueue("Difa", 89);
        que.enQueue("Dian", 35);
        que.enQueue("Robby", 100);
        que.enQueue("Dahlan", 68);
        que.enQueue("Ahmad", 25);
        que.enQueue("Margaret", 97);
        que.enQueue("Burhan", 45);
        que.display();
        System.out.println("====Prioritaskan Robby====");
        que.setPriority(100);
        que.Priority();
        que.display();

        System.out.println("====Prioritaskan Margaret====");
        que.setPriority(97);
        que.Priority();
        que.display();

        System.out.println("====Prioritaskan Ahmad====");
        que.setPriority(25);
        que.Priority();
        que.display();

    }
}
