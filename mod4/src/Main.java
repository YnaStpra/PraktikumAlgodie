import java.util.*;

public class Main {
    public static void main(String[] args) {
        // syntax di bawah ini digunakan untuk mendeklarasikan clas tree ke dalam variabel tri yang nilainya
        //  sama dengan variabel tree baru
        Tree tri = new Tree();
        Scanner java = new Scanner(System.in);

        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu daus, left yaitu putri dan right yaitu daden
        tri.insert("DAUS", "PUTRI", "DADEN");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu daus, left yaitu putri dan right yaitu daden
        tri.insert("PUTRI", "ARI", "LILUL");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu putri, left yaitu qri dan right yaitu lilul
        tri.insert("DADEN", "ARSAN", "JIDAN");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu daden, left yaitu arsan dan right yaitu jidan
        tri.insert("ARI", "UNO", "SHAFA");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu ari, left yaitu uno dan right yaitu shafa
        tri.insert("LILUL", "DIAZ", "MELKI");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu lilul, left yaitu diaz dan right yaitu melki
        tri.insert("ARSAN", "MAHEN", "ALITA");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu arsan, left yaitu mahen dan right yaitu alita
        tri.insert("JIDAN", "ROZAKI", "AGUNG");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method insert dengan
        // nama parent yaitu jidan, left yaitu rozaki dan right yaitu agung

        // syntax di bawah ini digunakan untuk mendeklarasikan hubungan dari silsilah keluarga tersebut
        System.out.println("\n" + "HUBUNGAN" + "\n");

        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu putri dan nama2 yaitu daus
        tri.relasi("PUTRI", "DAUS");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu putri dan nama2 yaitu daus
        tri.relasi("DAUS", "SHAFA");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu daus dan nama2 yaitu shafa
        tri.relasi("MAHEN", "ALITA");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu mahen dan nama2 yaitu aliat
        tri.relasi("MAHEN", "UNO");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu putri dan nam2 yaitu daus
        tri.relasi("DAUS", "LILUL");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu daus dan nama2 yaitu lilul
        tri.relasi("MELKI", "DADEN");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu melki dan nama2 yaitu daden
        tri.relasi("ARSAN", "ROZAKI");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu arsan dan nama2 yaitu rozaki
        tri.relasi("ROZAKI", "ARI");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu rozaki dan nama2 yaitu ari
        tri.relasi("DIAZ", "AGUNG");
        //syntax di bawah ini digunakan untuk mendeklarasikan variabel tri, kemudian memanggil method relsi dengan
        // nama1 yaitu diaz dan nama2 yaitu agung


        //syntax di bawah ini digunakan untuk memanggil sekaligus menampilkan funtion dari pre order yang telah di deklarasikan
        // sebelumya
        System.out.println("\n" + "PRE-ORDER" + "\n");
        tri.po();
        // java.close() merupakan sebuah method yang digunakan untuk keluar dari program yang dibuat.
        java.close();
    }

}
