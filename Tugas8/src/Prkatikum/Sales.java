package Tugas8.src.Prkatikum;

public class Sales extends Pegawai {
    private int pejualan;
    private double komisi;

    public Sales(String nama, String noKTP, int pejualan, double komisi) {
        super(nama, noKTP);
        this.pejualan = pejualan;
        this.komisi = komisi;
    }

    public int getPejualan() {
        return pejualan;
    }

    public void setPejualan(int pejualan) {
        this.pejualan = pejualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji() {
        return (int) getPejualan() * getKomisi();
    }

    @Override
    public String toString() {

        return super.toString() + String.format("\nTotal Penjualan%3s%s \nBesaran Komisi%4s%s  \nPendapatan%11s%s \n",
                ": ", getPejualan(), ": ", getKomisi(), ": Rp.", gaji());
    }
}
