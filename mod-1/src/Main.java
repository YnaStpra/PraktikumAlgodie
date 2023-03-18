/* Public

public class Main {
    public static void main(String[] args) throws Exception {
      Linkedlistno1 listbarisan = new Linkedlistno1();
      Linkedlistno1 listberteduh = new Linkedlistno1();
      Linkedlistno1 listnonton = new Linkedlistno1();

      System.out.println("KETIKA PENAMPILAN FEAST :");
      listbarisan.addFirst("Alita", 155, 33);
      listbarisan.addLast("Putri", 158, 34);
      listbarisan.addLast("Devian", 160, 36);
      listbarisan.addLast("Melki", 165, 40);
      listbarisan.addLast("Pande", 168, 51);
      listbarisan.addLast("Azzam", 170, 57);
      listbarisan.addLast("Weng", 182, 61);
      listbarisan.addLast("Jidan", 183, 62);
      listbarisan.printAll();

      System.out.println("\nKETIKA DEVIAN KELUAR BARISAN :");
      listbarisan.delete("Devian");
      listbarisan.printAll();

      System.out.println("\nKETIKA DADI DATANG MENGGANTIKAN DEVIAN :");
      listbarisan.addAfter("Dadi", 164, 37, "Putri");
      listbarisan.printAll();

      System.out.println("\nKETIKA AZZAM KELUAR BARISAN :");
      listbarisan.delete("Azzam");
      listbarisan.printAll();

      System.out.println("\nKETIKA AGUS GANTIKAN AZZAM :");
      listbarisan.addAfter("Agus", 169, 54, "Pande");
      listbarisan.printAll();

      System.out.println("\nDikarenakan hujan lebat akhirnya barisan tersebut terpecah menjadi dua barisan");

      System.out.println("\nBERTEDUH :");
      listberteduh.addFirst("Agus", 169, 54);
      listberteduh.addLast("Dadi", 164, 37);
      listberteduh.addLast("Jidan", 183, 62);
      listberteduh.addLast("Weng", 182, 61);
      listberteduh.printName();

      System.out.println("\nTETAP MENONTON KONSER :");
      listnonton.addFirst("Alita", 155, 33);
      listnonton.addLast("Putri", 158, 34);
      listnonton.addLast("Permadi", 168, 51);
      listnonton.addLast("Melki", 165, 40);
      listnonton.printName();

      System.out.println("\nOUTPUT :");
      listnonton.connectNode(listnonton, listberteduh);
    }
}
