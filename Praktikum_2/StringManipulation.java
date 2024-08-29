import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca dua string dari input
        String A = sc.nextLine();
        String B = sc.nextLine();

        // Output 1: Menjumlahkan panjang string A dan B
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        // Output 2: Membandingkan A dan B secara leksikografis
        // Metode compareTo() membandingkan dua string berdasarkan urutan leksikografis (abjad).
        // Jika A lebih besar dari B (secara leksikografis), nilai yang dikembalikan akan positif,
        // maka akan mencetak "Yes". Jika tidak, atau jika A sama dengan B, akan mencetak "No".
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Output 3: Mencetak A dan B dengan huruf pertama kapital
        // Mengambil huruf pertama dari string A, mengubahnya menjadi huruf besar (kapital),
        // dan menggabungkannya kembali dengan sisa string A.
        // Proses yang sama dilakukan untuk string B.
        // Kemudian, kedua string yang telah dikapitalisasi dicetak dengan spasi di antara mereka.
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

    }
}
