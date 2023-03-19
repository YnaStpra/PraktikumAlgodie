package Nomor2;
//membuat class main untuk melakukan fungsi utama
public class Main{
// membuat fungsi untuk menentukan derajat opertor berdasarkan
// inputan infix user dengan parameter pecahan string infix
    public static int getPriority(char ch) {
//        jika operator adalah penjumlahan atau pengurangan maka
//        derajat nya satu
        if (ch == '-' || ch == '+')
            return 1;
//        jika operator adalah perkalian atau pembagian maka
//        derajat nya dua
        else if (ch == '*' || ch == '/')
            return 2;
//        jika operator adalah pangkat maka
//        derajat nya 3
        else if (ch == '^')
            return 3;
        return 0;
    }
// membuat fungsi untuk membalikkan string dari infix
    public static String reverse(String str){
        String nstr = "";
        char ch;
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
//            membuat kondisi jika salah satu karakter adalah '(' maka akan
//            diubah menjadi ')'
            if (ch=='('){
                ch=')';
//            membuat kondisi jika salah satu karakter adalah ')' maka akan
//            diubah menjadi '('
            }else if(ch==')'){
                ch='(';
            }
            nstr = ch+nstr;
        }
        return nstr;
    }
//    membuat fungsi untuk menkonversi string infix ke postfix
//    dengan nilai kembalian String
    private static String toPostfix(String infix) {
//        membuat stack untuk menyimpan operator dan ekspresi dari infix
        Stack operators = new Stack();
//        membuat variabel cahr untuk menyimpan sementara ekspresi selain operator
        char symbol;
//        membuat variabel untuk hasil akhir dari postfix
        String postfix = "";
//        melakukan perulangan berdasarkan panjang dari infix
        for (int i = 0; i < infix.length(); ++i) {
//            meyimpan satu satu char dari string infix ke variabel symbol
            symbol = infix.charAt(i);
//            membuat kondisi apakah variabel symbol tersebut adalah bukan operator
            if (Character.isLetter(symbol)){
//                maka langsung dimasukkan ke dalam string postfix
                postfix = postfix + symbol;
//                kondisi jika vairabel symbol adalah tanda kurung terbuka
            }else if (symbol == '(') {
//                maka symbol akan dipush ke stack operator
                operators.push(symbol);
//                kondisi jika vairabel symbol adalah tanda kurung tertutup
            }else if (symbol == ')') {
//                kemudian memeriksa satu stack operator tersebut yang hanya didalam kolom saja
                while (operators.retrieve() != '(') {
//                    operator operator tersebut akan dimasukkan ke string postfix
                    postfix = postfix + operators.pop();
                }
//                jika perulangan tidak terpenuhi maka mengepop stack operator
                operators.pop();
//                jika semua kondisi tidak terpenuhi
            } else {
//                melakukan perulangan untuk memriksa apakah stack operator tidak kosong
//                dan data teratas stack operator bukan '('
//                dan derajat dari variabel symbol kurang dari derajat data paling atas stack operator
                while (!operators.isEmpty() && !(operators.retrieve() == '(') &&
                        getPriority(symbol) <= getPriority(operators.retrieve())) {
//                    operator operator tersebut akan dimasukkan ke string postfix
                    postfix = postfix + operators.pop();
                }
//              jika perulangan tidak terpenuhi maka stack operator push dengan parameter variabel symbol
                operators.push(symbol);
            }
        }
//      ketika perulangan berdasarkan panjang infix telah selesai
//      memasukkan sisa sisa data dari stack operator ke string postfix
        while (!operators.isEmpty())
            postfix = postfix + operators.pop();
        return postfix;
    }
//    membuat fugnsi untuk menkonversi infix ke prefix
//    kaidah kaidah dari prefix sama dengan postfix
//    hanya saja sebalum di operasikan
//    infix direverse terlebih dahulu
//    lalu dimasukkan ke operasi postfix
//    setelah dioperasikan
//    lalu direverse kembali, maka akan menghasilkan berntuk prefix
    private static String toPrefix(String infix) {
        String prefix = reverse(infix);
        return reverse(toPostfix(prefix));
    }

//    membuat fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        System.out.println("===Convert InFix to Prefix and PostFix===");
        System.out.println("-----------------------------------------");
        String test = "(A+B)*C-(D-E)*(F+G)";
        System.out.println("Notasi InFix\t:"+test);
        System.out.println("-----------------------------------------");
//        melakukan konversi infix dengan nama variabel test ke postfix
//        menggunakan fungsi topostfix
        System.out.println("Notasi PostFix\t:"+toPostfix(test));
//        melakukan konversi infix dengan nama variabel test ke prefix
//        menggunakan fungsi toprefix
        System.out.println("Notasi PreFix\t:"+toPrefix(test));
        System.out.println("-----------------------------------------");
    }
}
