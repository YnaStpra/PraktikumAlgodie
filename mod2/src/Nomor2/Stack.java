package Nomor2;
//mengimport suatu library yang nantinya digunakan untuk memberi peringatan
//elemen kosong atau tidak ada
import java.util.NoSuchElementException;
// membuat class Stack yang digunakan untuk menyimpan node dan operasi
//operasi dari stack atau tumpukan
public class Stack {
    //membuat class node yang nantinya digunakan untuk menyimpan value dari stack
//    dengan visibility private agar class node hanya bisa digunakan di class stack
    private class Node {
        //        mendeklarasikan variabel dengan nama value dengan tipe dara char
//        yang nantinya digunakan untuk menyimpan operator maupun operand
        char value;
        //        mendeklarasikan variabel dengan tipe data node untuk merujuk ke node selanjutnya
        Node next;
//        membuat konstraktor dari class Node untuk otomatis menginputkan nilai dari variabel
//        value hanya dengan parameter
        Node(char value){
            this.value = value;
        }
    }
//    mendeklarasikan variabel head dengan tipe data node untuk menandakan sebagai data awal
    Node head;
//    mendeklarasikan variabel head dengan tipe data node untuk menandakan sebagai data akhir
    Node tail;
//    membuat function untuk menambahkan data pada stack
//    dengan parameter value dari user
    public void push(char value){
//        membuat variabel nodebaru untuk menyimpan data baru
        Node newNode = new Node(value);
//        membuat kondisi apakah data sudah ada atau belum
//        jika belum, maka membuat data baru dengan data awal dan akhir sama
        if (isEmpty()){
            head = tail = newNode;
        }else{
//            jika kondisi sebelumnya tidak terpenuhi
//            maka akan menempatkan data baru sebelum data pertama,
//            dengan perujuk data baru next ke head
            newNode.next = head;
//            meletakkan kembali head ke data baru
            head = newNode;
        }
    }
    //    membuat fungsi untuk mengambil data sekaligus menghapus data tersebut
    public char pop(){
//        membuat kondisi jika data masih belum ada, maka akan ,
//        memberikan peringatan bahawa elemen belum ada
        if (isEmpty()){
            throw new NoSuchElementException();
        }else{
//            membuat variabel sementara untuk meyimpan data paling atas
            Node popItem = head;
//            menghapus data awal
            head = head.next;
//            mereturn value dari variabel sementara
            return popItem.value;
        }
    }
//    membuat fungsi untuk mengambil data paling atas tanpa perlu menghapusnya
    public char retrieve(){
        return head.value;
    }
    //   membuat fungsi untuk memeriksa apakah stack tersebut masih kosong atau tidak
    public boolean isEmpty() {
        return (head == null);
    }
}