package Nomor1;
//membuat class main untuk melakukan fungsi utama
public class Main {
//    membuat fungsi utama untuk menjalankan program
    public static void main(String[] args) {
//        menkonstraktorkan class stack dengan nama objek data
        Stack data = new Stack();
//        melakukan push atau menambah data ke stack
        data.push("Goku");
        data.push("Anya");
        data.push("Nagato");
        data.push("Denji");
        data.push("Loid");
//        mencetak kondisi ketika data belum di pop sesuai keinginan user
        data.printAll();
//        melakukan penghapusan data sesuai keinginan user
        data.deleteByValue("Anya");
//        mencetak kondisi ketika data telah di pop sesuai keinginan user
        data.printAll();

    }
}
