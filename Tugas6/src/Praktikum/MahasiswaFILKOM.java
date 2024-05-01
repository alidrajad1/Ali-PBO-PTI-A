package Tugas6.src.Praktikum;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk,String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String namaProdi;
        switch (prodi) {
            case 2:
                namaProdi = "Teknik Informatika";
                break;
            case 3:
                namaProdi = "Teknik Komputer";
                break;
            case 4:
                namaProdi = "sistem Informasi";
                break;
            case 6:
                namaProdi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                namaProdi = "Teknologi Informasi";
                break;
            default:
                namaProdi = "Prodi tidak diketahui";
        }
        return namaProdi + ", " + (2000 + angkatan);
    }

    public double gteBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus();
    }

}
