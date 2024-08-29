public class Constants {
    public static void main(String[] args) {
        // Mendefinisikan konstanta CM_PER_INCH untuk konversi dari inci ke sentimeter.
        final double CM_PER_INCH = 2.54;

        // Mendefinisikan lebar kertas dalam inci.
        double paperWidth = 8.5;

        // Mendefinisikan tinggi kertas dalam inci.
        double paperHeight = 11;

        // Menghitung dan mencetak ukuran kertas dalam sentimeter.
        System.out.println("Paper size in centimeters: " +
                paperWidth * CM_PER_INCH + " by " + paperHeight *
                CM_PER_INCH);
    }
}
