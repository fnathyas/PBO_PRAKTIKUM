import java.util.Scanner;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // menerima input jumlah bilangan yang akan di-check
        System.out.println("Masukkan jumlah bilangan yang akan dicheck: ");
        int jBil = sc.nextInt();

        for (int i = 0; i < jBil; i++) {
            boolean canBeFitted = false;

            // input bilangan yang akan dicheck
            System.out.println("Masukkan bilangan yang ingin dicheck: ");
            long bil = sc.nextLong();

            System.out.println(bil + " can be fitted in:");

            // memeriksa apakah bil bisa disimpan dalam byte
            if (bil >= -128 && bil <= 127) {
                canBeFitted = true;
                System.out.println("* byte");
            }
            // memeriksa apakah bil bisa disimpan dalam short
            if (bil >= -32768 && bil <= 32767) {
                canBeFitted = true;
                System.out.println("* short");
            }
            // memeriksa apakah bil bisa disimpan dalam int
            if (bil >= -2147483648L && bil <= 2147483647L) {
                canBeFitted = true;
                System.out.println("* int");
            }
            // memeriksa apakah bil bisa disimpan dalam long
            if (bil >= -9223372036854775808L && bil <= 9223372036854775807L) {
                canBeFitted = true;
                System.out.println("* long");
            }
            // jika bil tidak bisa disimpan dalam tipe data manapun
            if (!canBeFitted) {
                System.out.println(bil + " can’t be fitted anywhere");
            }
        }
    }
}
