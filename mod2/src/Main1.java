package Modul2;

public class Main1 {
    public static void main(String[] args) {
        Stack stacko = new Stack();
        stacko.push("Goku");
        stacko.push("Anya");
        stacko.push("Nagato");
        stacko.push("Denji");
        stacko.push("Loid");

        System.out.println("Stack Sebelum Elemen Dihapus");
        stacko.printAll();

        Fun.deleteString(stacko, "Anya");
        System.out.println("\nStack Setelah Elemen Dihapus");
        stacko.printAll();

    }
}
