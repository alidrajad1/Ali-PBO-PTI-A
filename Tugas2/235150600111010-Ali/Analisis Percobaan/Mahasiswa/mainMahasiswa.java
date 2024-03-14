package Mahasiswa;
public class mainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Mahasiswa A", 50, 100);
        int lamaMenulis = mahasiswa.hitungLamaMenulis();
        System.out.println(mahasiswa.getNama() + " akan menghabiskan satu buku tulis dalam " + lamaMenulis + " hari.");
    }
}