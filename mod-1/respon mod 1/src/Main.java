public class Main {
    public static void main(String[] args) {
        respon list = new respon();
        System.out.println("Data 1:");
        list.AddLast(2);
        list.AddLast(6);
        list.printAll();

        System.out.println(" ");
        System.out.println("Data 2:");
        respon list2 = new respon();
        list2.AddLast(3);
        list2.AddLast(4);
        list2.AddLast(5);
        list2.printAll();

        System.out.println(" ");
        System.out.println("Data 3:");
        respon list3 = new respon();
        list3.AddLast(7);
        list3.AddLast(9);
        list3.AddLast(8);
        list3.printAll();

        System.out.println(" ");
        System.out.println("Hasil Gabung: ");
        list.connected(list2);
        list2.connected(list3);
        list.printAll();
    }
}
