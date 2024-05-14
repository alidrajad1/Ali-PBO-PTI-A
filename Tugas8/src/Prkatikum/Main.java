package Tugas8.src.Prkatikum;

public class Main {
    public static void main(String[] args) {
        // Create an array of Pegawai type
        Pegawai[] pegawais = new Pegawai[9];

        // Upcasting: Assign Tetap, Harian, and Sales objects to Pegawai array
        pegawais[0] = new Tetap("Tetap1", "3107200101010001", 200000);
        pegawais[1] = new Tetap("Tetap2", "3107200101010002", 300000);
        pegawais[2] = new Tetap("Tetap3", "3107200101010003", 400000);
        
        pegawais[3] = new Harian("Harian1", "3107200101010004", 15000, 30);
        pegawais[4] = new Harian("Harian2", "3107200101010005", 14000, 40);
        pegawais[5] = new Harian("Harian3", "3107200101010006", 13000, 50);
        
        pegawais[6] = new Sales("Sales1", "3107200101010007", 30, 12000);
        pegawais[7] = new Sales("Sales2", "3107200101010008", 40, 13000);
        pegawais[8] = new Sales("Sales3", "3107200101010009", 50, 14000);

        // Iterate over the array and perform downcasting
        for (Pegawai pegawai : pegawais) {
            System.out.println(pegawai);

            // Downcasting to specific subclass to access their methods
            if (pegawai instanceof Tetap) {
                Tetap tetap = (Tetap) pegawai;
                System.out.println("Gaji Tetap: " + tetap.gaji());
            } else if (pegawai instanceof Harian) {
                Harian harian = (Harian) pegawai;
                System.out.println("Gaji Harian: " + harian.gaji());
            } else if (pegawai instanceof Sales) {
                Sales sales = (Sales) pegawai;
                System.out.println("Gaji Sales: " + sales.gaji());
            }

            System.out.println();
        }
    }
}
