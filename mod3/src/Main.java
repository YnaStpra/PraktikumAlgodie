/* public class Main merupakan class untuk merepresentasikan objek, method dan atribut -
   yang akan dieksekusi.
   menggunakan public class bertujuan agar semua method dan objek dalam public class Main -
   ini dapat diakses secara global oleh class lain. */
public class Main {
    /* "String[] args" adalah sebuah parameter yang bertipe data string yang mengandung -
    array karena terdapat tanda "[] yang berfungsi untuk menampung argumen - arguman -
    yang akan dijalankan oleh program */
    public static void main(String[] args) throws Exception {
        //membuat objek baru atau list baru dengan class Nomor1
        Nomor1 List1 = new Nomor1();
        //memasukan semua data barang ke dalam list
        List1.addFirst("Mizon", 6000, 30);
        List1.addLast("Indomie Goreng", 3500, 8);
        List1.addLast("Pulpy", 3000, 17);
        List1.addLast("Indomie Soto", 3000, 12);
        List1.addLast("Kopikap", 1500, 40);
        List1.addLast("Nabati Coklat", 2000, 34);
        List1.addLast("Nabati Permen Karet", 2000, 39);
        List1.addLast("Kuda Mas Original", 1000,77);

        //menampilkan list barang sebelum diurutkan
        System.out.println("\nData Belum terurut:");
        List1.printAll();

        //menampikan list barang setelah diurutkan berdasarkan harga
        System.out.println("\nUrutkan Berdasarkan Harga:");
        List1.insertionSortHarga();
        List1.printAll();

        //menampilkan list barang setelah diurutkan berdasarkan stok
        System.out.println("\nUrutkan Berdasarkan Stok:");
        List1.head = List1.mergeSortStok(List1.head);
        List1.printAll();

        //menampilkan list barang setelah diurutkan berdasarkan nama
        System.out.println("\nUrutkan Berdasarkan Nama:");
        List1.bubbleSortName();
        List1.printAll();

        //mencari barang "Indomie Goreng" dalam list dengan menggunakan sequensial search
        List1.sequentialSearch("Indomie Goreng");
        //mencari barang "Nabati Coklat" dalam list dengan menggunakan binary search
        List1.binarySearch(List1, "Nabati Coklat");
        //mencari barang "Pulpy" dalam list dengan menggunakan sequensial search
        List1.sequentialSearch("Pulpy");
        //mencari barang "Nabati Keju" dalam list dengan menggunakan sequensial search
        List1.sequentialSearch("Nabati Keju");
    }
}
 