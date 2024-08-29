class ConvertDataType
{
    // Method methodOne mengonversi nilai long ke int, lalu ke short, dan mengembalikannya.
    static short methodOne(long l)
    {
        int i = (int) l; // Mengonversi nilai long l menjadi int
        return (short)i; // Mengonversi nilai int i menjadi short dan mengembalikannya
    }

    public static void main(String[] args)
    {
        // Mendeklarasikan variabel double d dengan nilai 10.25
        double d = 10.25;

        // Mengonversi nilai double d ke float
        float f = (float) d;

        // Memanggil methodOne dengan mengonversi float f ke long,
        // kemudian mengonversi hasilnya ke byte
        byte b = (byte) methodOne((long) f);

        // Mencetak nilai variabel b
        System.out.println(b);
    }
}
