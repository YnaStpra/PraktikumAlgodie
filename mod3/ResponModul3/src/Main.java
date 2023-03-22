public class Main {
    public static void main(String[] args) {
        sortNsearch obj = new sortNsearch();
        System.out.println("====No. 1====");
        System.out.print("Masukkan Jumlah Data : ");
        int n = obj.sc.nextInt();
        System.out.println("Data Random :");
        for(int i = 0; i < n; i++) {
            obj.add(obj.rand.nextInt(100) + 1);
        }
        obj.display();

        System.out.println("\nSorting Ascend :");
        obj.bubbleSort();
        obj.display();
        System.out.println("\nSorting Descend :");
        obj.insertionSort();
        obj.display();

        sortNsearch obj2 = new sortNsearch();
        System.out.println("\n\n====No. 2====");
        obj2.add(5);
        obj2.add(2);
        obj2.add(6);
        obj2.add(7);
        obj2.add(3);
        obj2.add(9);
        obj2.add(1);
        obj2.add(0);
        obj2.add(4);
        obj2.add(2);
        obj2.display();

        int max = obj2.nilaiMax();
        int min = obj2.nilaiMin();

        System.out.println("\n\nSequential search");
        System.out.print("Nilai Max :");
        obj2.sequentialSearch(max);
        System.out.print("Nilai Min :");
        obj2.sequentialSearch(min);

        System.out.println("\nBinary search");
        obj2.bubbleSort();
        obj2.display();
        System.out.print("\nNilai Max :");
        obj2.binarySearch(obj2, max);
        System.out.print("Nilai Min :");
        obj2.binarySearch(obj2, min);
    }
}