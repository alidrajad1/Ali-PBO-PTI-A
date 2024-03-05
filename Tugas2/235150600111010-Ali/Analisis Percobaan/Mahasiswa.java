public class Mahasiswa {
    private String nama;
    private int jumlahHalamanBuku;
    private int kataPerHari;

    public Mahasiswa(String nama, int jumlahHalamanBuku, int kataPerHari) {
        this.nama = nama;
        this.jumlahHalamanBuku = jumlahHalamanBuku;
        this.kataPerHari = kataPerHari;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJumlahHalamanBuku(int jumlahHalamanBuku) {
        this.jumlahHalamanBuku = jumlahHalamanBuku;
    }

    public int getJumlahHalamanBuku() {
        return jumlahHalamanBuku;
    }

    public void setKataPerHari(int kataPerHari) {
        this.kataPerHari = kataPerHari;
    }

    public int getKataPerHari() {
        return kataPerHari;
    }

    public int hitungLamaMenulis() {
        int totalKata = jumlahHalamanBuku * (kataPerHari * 2); // Karena setiap halaman hanya cukup untuk 1/2 halaman buku
        return totalKata / kataPerHari; // Membagi total kata dengan jumlah kata yang ditulis per hari
    }

}

