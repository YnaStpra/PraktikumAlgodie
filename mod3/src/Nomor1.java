/*membuat class Nomor1 yang digunakan untuk menyimpan node data dan method
method dari stack */
public class Nomor1 {
    // mendeklarasikan variabel-variabel bantu yang akan digunakan
    Node current;
    String tempName;
    int tempHarga, tempStok;
    Node current2;
    Node head;
    Node tail;
     /*membuat class node yang nantinya digunakan untuk menyimpan 
    data dari stack*/
    class Node {
        // mendeklarasikan variabel pointer dan variabel untuk menampung data pada node
        Node next;
        Node prev;
        int harga, stok;
        String name;
          /*membuat konstraktor dari class Node untuk otomatis menginputkan nilai dari variabel
        name, harga dan stok hanya dengan parameter */
        Node(String name, int harga, int stok){
            this.name = name;
            this.harga = harga;
            this.stok = stok;
            next = null;
            prev = null;
        }
    }
    /* "public void addfirst" adalah method yang digunakan untuk menambahkan node 
    data pada awal linked list */
    public void addFirst(String name, int harga, int stok) {
        //membuat objek node baru
        Node node = new Node(name, harga, stok);
        if (head == null) {
            head = tail = node; 
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            head.prev = null;
        }
    }

    /*public void addlast adalah method yang digunakan untuk menambahkan node 
    data pada akhir linked list */
    public void addLast(String name, int harga, int stok) {
        //membuat objek node baru
        Node node = new Node(name, harga, stok);
        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    /* "public void printAll" adalah method yang digunakan untuk menampilkan 
    data setiap list ke layar */
    public void printAll() {
        current = head;
        while (current != null) {
            System.out.println("Nama : " + current.name + "," + " Harga : " + current.harga + "," + " Stok : " + current.stok);
            current = current.next;
        }
    }
    /* membuat method bubblesort yeng merupakan metode pengurutan algoritma dengan 
    cara melakukan penukaran data secara terus menerus sampai bisa dipastikan 
    dalam suatu iterasi tertentu tidak ada lagi perubahan/penukaran  */
    public void bubbleSortName(){
        current = head;
        while (current != null) {
            current2 = current.next;
            while (current2 != null) {
                    if (current.name.compareTo(current2.name) > 0) {
                    //membuat proses penukaran data1 dengan data2
                    tempName = current.name;
                    tempHarga = current.harga;
                    tempStok = current.stok;
                    current.name = current2.name;
                    current.harga = current2.harga;
                    current.stok = current2.stok;
                    current2.name = tempName;
                    current2.harga = tempHarga;
                    current2.stok = tempStok;
                }
                current2 = current2.next;
            }
            current = current.next;
        }
    }

    // membuat method swap yang berfungsi untuk menukar posisi data1 dengan data2
    public void swap(Node node1, Node node2){
        tempName = node1.name;
        tempHarga = node1.harga;
        tempStok = node1.stok;
        node1.name = node2.name;
        node1.harga = node2.harga;
        node1.stok = node2.stok;
        node2.name = tempName;
        node2.harga = tempHarga;
        node2.stok = tempStok;
    }

    /*membuat method insertion sort yang merupakan metode pengurutan data dengan 
    melakukan penempatan setiap elemen data pada posisinya dengan membandingkan 
    dengan data-data yang telah ada */
    public void insertionSortHarga(){
        current = head;
        while (current != tail) {
            current2 = current.next;
            if (current.harga < current2.harga  ) {
                //memanggil method swap untuk menukar data
                swap(current, current2);
                while (current.prev != null) {
                    if (current.prev.harga < current.harga) {
                        //memanggil method swap untuk menukar data
                        swap(current.prev, current);
                    }
                    current = current.prev;
                }
            }
            current = current.next;
        }
     }

     /*membuat method sequential search yang merupakan teknik pencarian data dari array, 
     dimana data dalam array dibaca 1 demi satu, diurutkan dari index terkecil ke index 
     terbesar, maupun sebaliknya */
     public void sequentialSearch(String search) {
        current = head;
        System.out.println("\nMencari Barang : " + search);
        while (current != null) {
            //membuat kondisi jika data pada current sama dengan data yang dicari
           if (current.name.equals(search)) {
              System.out.println("==== Barang Ditemukan ====");
              System.out.println("Nama Barang : " + current.name);
              //membuat kondisi jika barang berada ditengah list
              if (current.prev != null && current.next != null) {
                 System.out.println("Letak : Sebelum Barang " + current.next.name);
                 System.out.println("        Setelah Barang " + current.prev.name);
                 return;
                  //membuat kondisi jika barang berada didepan list
              } else if (current.prev == null) {
                 System.out.println("Letak : Sebelum Barang " + current.next.name);
                 return;
                  //membuat kondisi jika barang berada dibelakang list
              } else if (current.next == null) {
                 System.out.println("Letak : Setelah Barang " + current.prev.name);
                 return;
              }
           }
           current = current.next;
        }
        System.out.println("==== Barang Tidak Ditemukan ====");
     }

    /*membuat method merge sort yang merupakan pengurutan dengan cara membagi list menjadi
    2 bagian sampai list tidak dapat dibagi lagi, lalu memgurutkan dengan membandingkan 
    data sebelah kiri dan kanan, lalu menggabungkan list tersebut */    
    Node mergeSortStok(Node headref){
        if (headref == null || headref.next == null || headref.prev == null ) {
            return headref;
        }
        //memcari data tengah list dengan memanggil method getMid dan menyimpan dalam variabel mid
        Node middle = midPoint(headref);
        Node nextmiddle = middle.next;
        //untuk membagi list menjadi 2 bagian dengan cara memutuskan link list
        middle.next = null;
        //memanggil method merge sort untuk membagi lagi list sebelah kiri
        Node left = mergeSortStok(headref);
        //memanggil method merge sort untuk membagi lagi list sebelah kiri
        Node right = mergeSortStok(nextmiddle);
        //memanggil method sorted merge untuk menggambungkan dan mengurutkan list yang sudah dibagi
        Node sortedlist = sortedMerge(left, right);
        //mengembalikan list yang sudah terurut
        return sortedlist;
    }

    // membuat method untuk mengurutkan dan menggabungkan data list yang sudah dibagi-bagi
    Node sortedMerge(Node a, Node b){
        Node result = null;
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        //berfungsi untuk membandingkan data 1 dengan data 2
        if (a.stok <= b.stok) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    //membuat method untuk menentukan data tengah list
    Node getMid(Node first, Node last) {
        if (first == null) {
           return null;
        }
        Node slow = first;
        Node faster = first.next;
        while (faster != last) {
           faster = faster.next;
           if (faster != last) {
              slow = slow.next;
              faster = faster.next;
           }
        }
        //mengembalikan data tengah list 
        return slow;
     }

     //membuat method untuk menentukan data tengah list
    Node midPoint (Node headref){
        Node slow = headref;
        Node fast = headref.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }
     
    /*membuat method binary search yang merupakan algoritma pencarian untuk data yang terurut. 
    Pencarian dilakukan dengan cara menebak apakah data yang dicari berada ditengah-tengah data, 
    kemudian membandingkan data yang dicari dengan data yang ada ditengah. */
    public void binarySearch(Nomor1 list, String search) {
        Node low = list.head;
        Node up = null;
  
        System.out.println("\nMencari Barang : " + search);
        do {
           Node mid = getMid(low, up);
           //membuat kondisi jika data tengah sama dengan data yang dicari
           if (mid.name.equals(search)) {
              System.out.println("==== Barang Ditemukan ====");
              System.out.println("Nama Barang : " + mid.name);
              //kondisi jika barang yang dicari berada ditengah list
              if (mid.prev != null && mid.next != null) {
                 System.out.println("Letak : Setelah Barang " + mid.prev.name);
                 System.out.println("        Sebelum Barang " + mid.next.name);
                 return;
              //kondisi jika barang yang dicari berada didepan list
              } else if (mid.prev == null){
                 System.out.println("Letak : Sebelum Barang " + mid.next.name);
                 return;
              //kondisi jika barang yang dicari berada dibelakang list
              } else if (mid.next == null) {
                 System.out.println("Letak : Setelah Barang " + mid.prev.name);
                 return;
              }
            } else if (mid.name.compareTo(search) < 0) {
              low = mid.next;
            } else {
              up = mid;
            }
        //kondisi jika barang tidak ada dalam list
        } while (up == null || up != low);{
           System.out.println("==== Barang Tidak Ditemukan ====");
        }
    }
    
    

}