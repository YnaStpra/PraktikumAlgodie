/* class tree merupakan sebuah class yang digunakan untuk mengeksekusi program dengan cara atau teknik untuk
mengatur elemen data seta melakukan pencrian data dalam bentuk tertentu. Tree adalah seperti pohon terbalik
yang memiliki daun atau leaf, akar atau root dan lain-lain. pada program ini tree digunakan untuk
mengeksekusi program guna mengetahui silsilah keluarga dari Daden.
 */
public class Tree {
    /* class node merupakan sebuah class yang digunakan untuk untuk mendeklarasikan variabel apa saja yang
    akan dieksekusi pada program tree atau silsilah keluarga ini.
     */
    class node {
        // string nama merupakan menginisialisasian variabel nama yang dimana variabel nama ini akan menampung
        // seluruh data nama dalam program silsilah keluarga ini, baik itu nama orang tua, anak, saudara kakek
        // nenek dan lain -lain.
        String nama;
        // node yang tidak memiliki child node sama sekali dinamakan leaf node, yg berisi alamat untuk menunjuk tree bagian kanan.
        // merupakan bagian elemen yang bertipe dasar “Address”, yg berisi alamat untuk menunjuk tree bagian kanan.
        node left, right;
        // syntax di bawah ini merupakan sebuah syntax yang digunakan untuk menginisialisasikan variebel nama
        // dengan dalam sebuah parameter dari veriabel node.
        node(String nama) {
            this.nama = nama;
        }
    }
    // node root merupakan sebuah penginisialisasian variebel utama/awal atau bisa di sebut juga dengan
    // sebuah node yang memiliki hirarki tertinggi atau akar dari motode tree.
    node root;

    // funtion atau method di bawah ini merupakan sebuah pendeklarsian yang digunakan untuk
    // menginputkan data yang ingin di eksekusi pada program silsilah keluarga ini dimana, didlamnya
    // terdapat parameter yang mendeklarasikan variabel perent(ortu), left dan right dengan tipe data
    // berupa string.
    void insert(String parent, String left, String right) {

        /* syntax dibawah ini merupakan sebuah pengkondisian yang didalamnya terdapat pengecekan, apabila
        varibel root bernilai kosong atau null naka akan melakukan proses yaitu, nilai dari variebel root
        akan sama dengan nilai dari variabel node dengan parameter berupa variabel parent, lalu
        akan mengeluarkan hasil yaitu, "dibuat sebagai root" yang berarti kondisi ini akn menjadikan variabel
        tersebut menjadi sebuah variabel dengan hirarki tertinggi
         */
        if (root == null) {
            root = new node(parent);
            System.out.println(parent + " Dibuat Sebagai Root");
        }
        /* syntax di bawah ini merupakan sebuah penginisialisasian variabel nama yang nilainya akan
        sama dengan nilai dari variebel pencarian dengan parameter yang memangil variabel root dan parent,
        kemudian variabel nama.leaf (yang artinya variabel nama akan dihubungkan dengan right atau bagian kanan dari program tree yang telah
        di deklarasikan sebelumnya.) yang nilainya akan sama dengan variabel node baru dnegan parameter yang memanggil variabel leaf yang telah di deklarasikan
        sebelumnya. lalu memangil (left + " ditambahkan sebagai left child dari " + parent) yang nantinya akan
        menghasilkan nama dari variabel leaf yang telah di eksekusi dan parent kan memangil nama dari ortu ynag telah
        di eksekusi sebelumnya.
         */
        node nama = pencarian(root, parent);
        nama.left = new node(left);
        System.out.println(left + " ditambahkan sebagai left child dari " + parent);
        /*syntax di bawah ini merupakan sebuah penginisialisasian variabel kemudian variabel nama.right
        yang artinya variabel nama akan dihubungkan dengan right atau bagian kanan dari program tree yang telah
        di deklarasikan sebelumnya. lalu menampilkan sekaligus memangil (left + " ditambahkan sebagai left
        child dari " + parent) yang nantinya akan menghasilkan nama dari variabel leaf yang telah di eksekusi
        dan parent kan memangil nama dari ortu ynag telahdi eksekusi sebelumnya.
          */
        nama.right = new node(right);
        System.out.println(right + " ditambahkan sebagai left child dari " + parent);
    }

    // node pencarian merupakan sebuah funtion atau method yang digunakan untuk melakukan pencarian nama pada program
    // root baik itu nama anak, orang tua, saudara, kakek dll. yang dimana pada funtion ini menggunakan
    // sebuah parameter yang memanggil variabel root dan parent yang digunkan untuk melakukan pencarian data berupa nama.
    //
    node pencarian(node root, String Parent) {
        // syntax di bawah merupakan sebuah pengkondisian yang didalmnya terdapat parameter yaitu nlai dri root
        // akan sama null atau kosong, kemudian akan langsung mengembalikan nilai dari variabel null tersebut.
        if (root == null) {
            return null;
        }
        // syntax di bawah ini merupakan sebuah kondisi yang kan dijalankan apabila kondisi sbelumnya tidak terpenuhi
        // dimana pada kondisi ini variabel awla atau root akan di sambungkan ke variabel nama dan diinisialisasikan
        // bahwa nilainya akan sama dengan nilai dari variabel perent, lalu setelah itu akan langsung mengemablikan
        // nilai dri variabel root itu sendiri.
        else if (root.nama == Parent) {
            return root;
        }
        // syntax dibawah ini merupakan sebuah penginisialisasian variabel semenatara/temp  akan sama dengan variabel
        // pencarian dengan parameter (root.left, Parent) yang nantinya digunakan untuk melakukan pengecekan sekaligus
        // pencarian.
        node tmp = pencarian(root.left, Parent);

        // syntax dibawah ini merupakan sebuah pengkondisian yaitu apabila nilai temp tidak sama dengan null atau kosong
        // maka akan mengamblikan nili dari varoiable itu sendiri
        if (tmp != null) {
            return tmp;
        } else {
            // syntax di bawah ini merupakan sebuah kondisi yang kan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // yaitu akan langusng mengembalikan nilai dari variabel pencarian
            return pencarian(root.right, Parent);
        }
    }

    // syntax dibawah ini merupakn sebuah method atau funtion yang digunakan untuk melakukan pengecekan level
    // dengan parameter berupa node, data dan level. yang diguankan untuk mengeksekusi program pre-order
    int ceklevel(node node, String data, int level) {
        // syntax dibawah ini merupakan sebuah pengkondisian apabila nilai node sama dengan null maka
        // akan mengembalikan nilai 0
        if (node == null)
            return 0;
        // syntax di bawah merupakan sebuah pengkondisian yang didalmnya terdapat parameter yaitu nlai dri node.nama akan sam dengan variabel data
        // lalu akan mengambalikan nilai dari variabel level
        if (node.nama == data)
            return level;

        // syntax dibawah ini merupaka sebuah method atau funtion yang digunakan untuk melakukan pengecekan
        // data yang lebih kecil, kemudian terdapat pengkondisian yaitu jika datanya tidak lebih kecil dari 0
        // maka akan mengembalikan variabel lebihkecil
        int lebihkecil = ceklevel(node.left, data, level + 1);
        if (lebihkecil != 0)
            return lebihkecil;

        lebihkecil = ceklevel(node.right, data, level + 1);
        return lebihkecil;
    }
    //  syntax dibwah ini digunakan untuk mendekalarasikan method atau funtion yang nantinya berguna untk
    // melakukan pengecekan sekaligus pencarian dari variabel pencarianorangtua
    String pencarianorangtua(node node, String baru, String parent) {
        // terdapat sebuah pengkondisian yaitu apabila node bernilai null maka akan mengembalikan nilai dari variabel null
        if (node == null)
            return null;
        // selanjutnya terdapat pengkondisian yaitu apabila node.nama bernilai baru maka akan mengembalikan nilai dari variabel parent
        if (node.nama == baru) {
            return parent;
        }
        //  syntax dibwah ini digunakan untuk mendekalarasikan method atau funtion tmp  atau variabel penampung sementara yang nantinya berguna untk
        //  melakukan pengecekan sekaligus pencarian dari variabel pencarianorangtua
        String tmp = pencarianorangtua(node.left, baru, node.nama);
        // terdapat pengkondisian yaitu nilai tmp tidak smaa denagn null maka akan mengemablikan nilai ymp
        if (tmp != null) {
            return tmp;
        } else {
            // syntax di bawah ini merupakan sebuah kondisi yang kan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            //  yaitu mengembalikan nilai dari variabel pencarianorangtua
            return pencarianorangtua(node.right, baru, node.nama);
        }
    }

    // berikut merupakan method yang digunakan untuk mencari hubungan keluarga
    // antara dua orang, yang dimana method ini bertipe data void
    // maka method ini tidak perlu mengembalikan nilai yang masuk dan diolah pada
    // method ini
    void relasi(String nama1, String nama2) {
        String tmp = null, tmp2 = null;
        int nilai1 = ceklevel(root, nama1, 0);
        int nilai2 = ceklevel(root, nama2, 0);
        int selisih = nilai1 - nilai2;

        // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan 0 maka akan
        // menginisialisasikan nilai tmp akan sama denagn pencarianorangtua(root, nama1, null), begitu juga
        // untuk seterusnya.
        if (selisih == 0) {
            tmp = pencarianorangtua(root, nama1, null);
            tmp2 = pencarianorangtua(root, nama2, null);
            // syntax dibawah ini merupakan sbuah pengkondisian untuk membandingkan nilai string tanpa mempedulikan
            // besar kecilnya variabel berupa string . lalu memanggil sekaligus nemapilkan nama1 dan nama2 berupa saudara dari
            if (tmp.equalsIgnoreCase(tmp2)) {
                System.out.printf("%s adalah saudara dari %s\n", nama1, nama2);
            } else {
                // syntax di bawah ini merupakan sebuah kondisi yang kan dijalankan apabila kondisi sbelumnya tidak terpenuhi
                // berfungsi untuk memanggil sekaligus nemapilkan nama1 dan nama2 barupa saudara jauh
                System.out.printf("%s adalah saudara jauh dari %s\n", nama1, nama2);
            }
            // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan 1
        } else if (selisih == 1) {
            // merupakan kondisi yang memanggil nama1 lalu equalsIgnoreCase yang berguna untuk membandingkan nilai
            // string tanpa mempduliakan besar kecilnya variabel berupa string, lalu memangil variabel nama2
            // lalu memanggil sekaligus menampilkan variabel nama1 dan nam2 adalah anak dari
            if (pencarianorangtua(root, nama1, " ").equalsIgnoreCase(nama2)) {
                System.out.printf("%s adalah anak %s\n", nama1, nama2);
                // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
                // syntax dibawah ini digunakan untuk memanggil seakligus menampilkan variabel nama1 dan nama2 untuk mendeklarasikan
                // keponakan dan keponakan jauh dari silsilah keluarga tersebut
            } else {
                tmp = pencarianorangtua(root, nama1, null);
                tmp = pencarianorangtua(root, tmp, null);
                if (tmp.equalsIgnoreCase(pencarianorangtua(root, nama2, null))) {
                    System.out.printf("%s adalah keponakan dari %s\n", nama1, nama2);
                } else {
                    System.out.printf("%s adalah keponakan jauh dari %s\n", nama1, nama2);
                }
            }
            // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan 2
            // syntax dibawah ini dignakan untuk memanggil seakligus menampilkan variabel nama1 dan nama2 untuk mendeklarasikan
            // cucu dan cucu jauh dari silsilah keluarga tersebut
        } else if (selisih == 2) {
            tmp = pencarianorangtua(root, nama1, null);
            tmp = pencarianorangtua(root, tmp, null);
            if (tmp.equalsIgnoreCase(nama2)) {
                System.out.printf("%s adalah cucu dari %s\n", nama1, nama2);
            } else {
                System.out.printf("%s adalah cucu jauh dari %s\n", nama1, nama2);
            }
            // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan 3
            // syntax dibawah ini dignakan untuk memanggil seakligus menampilkan variabel nama1 dan nama2 untuk mendeklarasikan
            // cicit dari silsilah keluarga terebut
        } else if (selisih == 3) {
            System.out.printf("%s adalah cicit dari %s\n", nama1, nama2);
            // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan -1
            // syntax dibawah ini dignakan untuk memanggil seakligus menampilkan variabel nama1 dan nama2 untuk mendeklarasikan
            // anak dari silsilah keluarga terebut
        } else if (selisih == -1) {
            if (pencarianorangtua(root, nama2, " ").equalsIgnoreCase(nama1)) {
                System.out.printf("%s adalah anak %s\n", nama2, nama1);
            } else {
                // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
                // syntax di atas merupakn sbuah pendeklarasian dari variabel tmp lalu menginisialisasikan (root, nama2, null)
                // dan (root, tmp, null).
                // syntax dibawah ini dignakan untuk memanggil seakligus menampilkan variabel nama2 dan nama1 untuk mendeklarasikan
                // keponakan dari dan keponakan jauh dari dari silsilah keluarga terebut
                tmp = pencarianorangtua(root, nama2, null);
                tmp = pencarianorangtua(root, tmp, null);
                if (tmp.equalsIgnoreCase(pencarianorangtua(root, nama1, null))) {
                    System.out.printf("%s adalah keponakan dari %s\n", nama2, nama1);
                } else {
                    System.out.printf("%s adalah keponakan jauh dari %s\n", nama2, nama1);
                }
            }
            // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan -2
            // syntax dibawah ini dignakan untuk memanggil sekaligus menampilkan variabel nama2 dan nama1 untuk mendeklarasikan
            // cucu dan cucu jauh dari silsilah keluarga terebut
        } else if (selisih == -2) {
            tmp = pencarianorangtua(root, nama2, null);
            tmp = pencarianorangtua(root, tmp, null);
            if (tmp.equalsIgnoreCase(nama1)) {
                System.out.printf("%s adalah cucu dari %s\n", nama2, nama1);
            } else {
                System.out.printf("%s adalah cucu jauh dari %s\n", nama2, nama1);
            }
            // syntax di bawah ini merupakan sebuah kondisi yang akan dijalankan apabila kondisi sbelumnya tidak terpenuhi
            // syntax dibawah ini merupakan sbuah pengkondisian apabila selisih sama dengan -3
            // syntax dibawah ini dignakan untuk memanggil sekaligus menampilkan variabel nama2 dan nama1 untuk mendeklarasikan
            // cicit dan tidak ada garis keturunan dari silsilah keluarga terebut
        } else if (selisih == -3) {
            System.out.printf("%s adalah cicit dari %s\n", nama2, nama1);
        } else {
            System.out.printf("%s dan %s tidak memiliki garis keturunan", nama1, nama2);
        }
    }
    // syntax di bawah ini merupakan sebuah method atau funtion yang nantinya digunakan untuk mengeksekusikan
    // motode pre order dalam program tree, ysng dimana pada funtion ini di dalamnya terdapat parameter
    // berupa variabel root
    void po() {
        preorder(root);
    }
    // syntaax di bawah ini digunakan untuk mengeksekusi metode pre orde yang didalmnya terdapat parameter
    // berupa variabel root
    void preorder(node root) {
        // terdapat pengkondisian yaitu apabila root tidak sama dengan null atau kosong maka akan melakukan konidisi lagi
        //  yang didalmny terdapat peremter yaitu pabila variabel root.left tidak sama dengan  null, maka
        // akan menampilkan sekaligus memangil variabel root.nama, root.left.nama dan root.right.nama. kemudian
        // memangil method preorder(root.left) dan preorder(root.right) yang nantiny berguna menampilkan
        // nama- nama dari variabel trs sesuai dengan fungsi root, left dan right
        if (root != null) {
            if (root.left != null) {
                System.out.println(root.nama + ": " + root.left.nama + " & " + root.right.nama);
                preorder(root.left);
                preorder(root.right);
            } else {
                // syntax dibawah ini digunakan untuk menggail nama dari variabel yang telah di eksekusi sebelumnya
                // sehingga mengasilkan nama-nama sesuai pengeksekussan dari metode pr-order
                System.out.println(root.nama + ": -");
            }

        }

    }
}
