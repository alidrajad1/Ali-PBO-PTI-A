package Praktikum;

public class KueBasi extends Kue {
    
    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    private int lamaHari;

    public int getLamaHari() {
        return lamaHari;
    }

    public double hitungHarga() {
        return getHarga() - (getLamaHari() * (getHarga() * 0.1));
    }
    
    @Override
    public String toString() {
        
        return super.toString()+"\nLama hari: " + getLamaHari();
    }
}
