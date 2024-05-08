package Praktikum;

/**
 * KueJadi
 */
public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungHarga() {
        return getHarga() * getJumlah() * 2;
    }

    @Override
    public String toString() {

        return super.toString() + "\nJumlah: " + getJumlah()+"\n";
    }
}