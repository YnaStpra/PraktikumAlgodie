package Nomor1;
//mengimport suatu library yang nantinya digunakan untuk memberi peringatan
//elemen kosong atau tidak ada
import java.util.NoSuchElementException;
// membuat class Stack yang digunakan untuk menyimpan node dan operasi
//operasi dari stack atau tumpukan
public class Stack {
    //membuat class node yang nantinya digunakan untuk menyimpan value dari stack
//    dengan visibility private agar class node hanya bisa digunakan di class stack
    private class Node{
//        mendeklarasikan variabel dengan nama value dengan tipe dara Object
//        tipe data object memiliki fungsi yang hampir sama dengan generic namun
//        untuk menyimpan data sesuai dengan tipe data dinamis,
        Object value;
//        mendeklarasikan variabel dengan tipe data node untuk merujuk ke node selanjutnya
        Node next;
//        membuat konstraktor dari class Node untuk otomatis menginputkan nilai dari variabel
//        value hanya dengan parameter
        Node(Object value){
            this.value = value;
        }
    }
//    mendeklarasikan variabel head dengan tipe data node untuk menandakan sebagai data awal
    Node head;
//    mendeklarasikan variabel head dengan tipe data node untuk menandakan sebagai data akhir
    Node tail;
//    membuat function untuk menambahkan data pada stack
//    dengan parameter value dari user
    public void push(Object value){
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
    public Object pop(){
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
//    membuat fungsi untuk menghapus data sesuai dengan inputan value user
    public void deleteByValue(Object obj){
//        membuat stack untuk menyimpan data dari pop stack utama
        Stack temp = new Stack();
//        membuat variabel pointer untuk merujuk ke data paling atas
        Node current = head;
//        melakukan perulangan dengan condisi variabel pointer tidak sama dengan null
        while(current!=null){
//            membuat kondisi apakah value dari variabel pointer sama dengan inputan user
            if (current.value.equals(obj)){
//                jika iya maka data tersebut di pop tanpa harus disimpan di stack sementra
//                maka perulangan langsung dihentikan
                pop();
                break;
            }else{
//                jika tidak maka data tersebut di pop dan juuga di push ke stack sementara
                temp.push(pop());
            }
//            variabel pinter akan berpindah ke data selanjutnya
            current=current.next;
        }
//        mengubah variabel pointer agar merujuk ke stack temporary
        current = temp.head;
//        melakukan perulangan untuk mengepop data dari stack temp kembali(push) ke stack utama
        while(current!=null){
            push(temp.pop());
            current=current.next;
        }
    }
//    membuat fungsi untuk menceetak semua value dari stack
    public void printAll(){
//        membuat variabel pointer untuk merujuk ke data paling atas
        Node current = head;
//        melakukan perulangan dengan condisi variabel pointer tidak sama dengan null
        while(current!=null){
            if (current==tail){
                System.out.println(current.value);

            }else{
                System.out.print(current.value+" -> ");
            }
            current=current.next;
        }
    }
//   membuat fungsi untuk memeriksa apakah stack tersebut masih kosong atau tidak
    public boolean isEmpty() {
        return (head == null && tail == null);
    }
}