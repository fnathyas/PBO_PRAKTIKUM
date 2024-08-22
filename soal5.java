public class soal5 { // Mendefinisikan sebuah kelas publik bernama "soal5". Nama kelas harus sama dengan nama file.

    public static void main(String[] args) { // Metode utama, titik masuk program yang akan dijalankan oleh JVM.

        int i = 42; // Mendeklarasikan variabel 'i' bertipe int dan menginisialisasinya dengan nilai 42.

        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        // Mendeklarasikan variabel 's' bertipe String dan menggunakan operator ternary untuk memberikan nilai:
        // - Jika 'i' kurang dari 40, 's' akan menjadi "life".
        // - Jika 'i' lebih besar dari 50, 's' akan menjadi "universe".
        // - Jika tidak keduanya, 's' akan menjadi "everything". Karena i=42, maka 's' menjadi "everything".

        System.out.println(s); // Mencetak nilai variabel 's' ke layar. Dalam kasus ini, outputnya adalah "everything".
    }
}
