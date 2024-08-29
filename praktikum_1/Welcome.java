/**
	*This program displays a greeting for the reader.
	*@version 1.30 2014-02-27
	*@author Cay Horstmann
	*/
public class Welcome { // Mendefinisikan kelas Welcome.

	public static void main(String[] args) { // Titik masuk program.

		String greeting = "Welcome to Core Java!"; // Deklarasi dan inisialisasi variabel greeting.
		System.out.println(greeting); // Cetak pesan greeting ke layar.

		for (int i = 0; i < greeting.length(); i++) // Loop melalui setiap karakter dalam greeting.
			System.out.print("="); // Cetak "=" untuk setiap karakter dalam greeting.

		System.out.println(); // Pindah ke baris baru setelah loop selesai.
	}
}
