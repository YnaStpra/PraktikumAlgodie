
/*
public class Linkedlistno1 merupakan class untuk merepresentasikan objek, method dan atribut -
yang akan digunakan dalam linkedlist.
menggunakan public class bertujuan agar semua method dalam public class Linkedlistno1 ini -
dapat diakses secara global oleh class lain.
*/
public class Linkedlistno1 {
    /* membuat class baru yaitu class Node untuk representasi dari tiap-tiap node yang akan -
       digunakan */
    class Node{
        /* menginisialisasi variabel height dan power dengan tipe integer karena variabel tersebut -
           akan diisi oleh bilangan.*/
        int height;
        int power;
        /* menginisialisasi variabel next yang berfungsi sebagai variabel pointer yang akan menyimpan -
           alamat dari node selanjutnya. */
        Node next;
        /* menginisialisasi variabel nama dengan tipe string karena variabel tersebut -
           akan diisi oleh nama orang.*/
        String nama;
        /* constructor merupakan suatu method yang akan memberikan nilai awal pada saat suatu objek dibuat.
           disini fungsi constructor adalah untuk memberikan nilai pada Node.
        */
        Node(String nama, int height, int power){
            /*this.nama adalah perintah yang digunakan untuk merepresentasikan variabel pada class tersebut -
              untuk membedakan variabel nama yang ada di dalam class dengan yang ada di parameter. 
             *this.height adalah perintah yang digunakan untuk merepresentasikan variabel pada class tersebut -
              untuk membedakan variabel height yang ada di dalam class dengan yang ada di parameter. 
              *this.power adalah perintah yang digunakan untuk merepresentasikan variabel pada class tersebut -
              untuk membedakan variabel power yang ada di dalam class dengan yang ada di parameter. 
            */
            this.nama = nama;
            this.height = height;
            this.power = power;
            /* next = null adalah untuk menginisialisasi nilai pada variabel next */
            next = null;
        }
    }

    /*menginisialisasi variabel head dan tail dengan class node yang berfungsi sebagai awal dan akhir -
      pada linked list
     *menginisialisasi variabel current sebagai variabel untuk mengakses setiap node pada linkedlist
    */
    Node head;
    Node tail;
    Node current;

    /*public void addfirst adalah method yang digunakan untuk menambahkan node data pada awal linked list -
      dengan parameter nama, height dan power */
    public void addFirst(String nama, int height, int power) {
        /*membuat objek node baru dengan parameter nama, height dan power */
        Node node = new Node(nama, height, power);
        /*perintah if adalah suatu pernyataan yang digunakan untuk mengecek suatu kondisi yaitu jika head == null*/
        if (head == null) {
            /*jika kondisi pada if bernilai true atau benar maka akan mengeksekusi perintah 'head = tail = node' yang -
              berfungsi untuk menaruh head dan tail pada node baru */
            head = tail = node; 
            /*'else' adalah sebuah kondisi lain dari pernyataan 'if' yang berarti jika kondisi pada 'if' tidak benar -
              maka akan mengeksekusi perintah pada 'else'*/
        } else {
            /*kode dibawah berfungsi untuk menyambungkan "node.next" dengan "head" yang akan menyimpan alamat dari "head"*/
            node.next = head;
            /*kode dibawah akan memindahkan head ke node baru yang ditambahkan */
            head = node;
        }
    }

    /*public void addlirst adalah method yang digunakan untuk menambahkan node data pada akhir linked list -
      dengan parameter nama, height dan power */
    public void addLast(String nama, int height, int power) {
        /*membuat objek node baru dengan parameter nama, height dan power */
        Node node = new Node(nama, height, power);
        /*menyambungkan "tail.next" dengan node yang akan menyimpan alamat dari node */
        tail.next = node;
        /*memindahkan tail ke node baru yang ditambahkan  */
        tail = node;
    }

    /*public void addAfter adalah method yang digunakan untuk menambahkan node data pada akhir linked list -
      dengan parameter nama, height dan power */
    public void addAfter(String nama, int height, int power, String posisi){
        /*untuk mengakses head digunakan current*/
        current = head;
        /*membuat objek node baru dengan parameter nama, height dan power */
        Node node = new Node(nama, height, power);
        while (current != null){
            if(current.nama == posisi){
                node.next = current.next;
                current.next = node;
                break;
            }
            current = current.next;
        }

    }
  /*public void deleteFirst adalah method yang digunakan untuk menghapus node data yang ada didepan linked list*/
    public void deleteFirst() {
        head = head.next;
    }
/*public void deletelast adalah method yang digunakan untuk menghapus node data yang ada dibelakang linked list*/
    public void deleteLast() {
        current = head;
        while (current.next != tail) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
    }
/*public void delete adalah method yang digunakan untuk menghapus node data yang ada pada linked list*/
    public void delete(String hapus){
        current = head;
        while (current.next != null){
            if(current.next.nama == hapus){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    public void printAll() {
        current = head;
        while (current != null) {
            System.out.println("Nama : " + current.nama + "," + " Height : " + current.height + "," + " Power : " + current.power);
            current = current.next;
        }
    }

    /*public void connectNode adalah method yang digunakan untuk menyambungkan kedua node data yang telah dibuat */
    public void connectNode(Linkedlistno1 data, Linkedlistno1 data2){
        data.tail.next = data2.head;
        current = data.head;
        printName();
    }

    /*public void Printname adalah method yang digunakan untuk menampilkan parameter nama */
    public void printName() {
        current = head;
        while (current != null) {
            System.out.println(current.nama);
            current = current.next;
        }
    }

}
