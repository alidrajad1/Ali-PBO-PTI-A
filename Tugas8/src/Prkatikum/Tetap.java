package Tugas8.src.Prkatikum;

public class Tetap extends Pegawai {
    private double upah;

    public Tetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double gaji() {
        return (int) getUpah();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nUpah%14s%s \nPendapatan%11s%s \n",": ", getUpah(),": Rp.", gaji());
    }
}