public class soal4 { // Mendefinisikan kelas soal4.

    public static void main(String[] args) { // Titik masuk program.

        byte angka1 = 125; // Deklarasi variabel angka1 dengan nilai 125.
        byte angka2 = 6; // Deklarasi variabel angka2 dengan nilai 6.
        byte hasil = (byte) (angka1 + angka2); // Jumlahkan angka1 dan angka2, hasilnya di-cast ke byte.

        System.out.println("Hasil 1 " + hasil); // Cetak hasil, outputnya adalah -125 karena overflow.
    }
}
