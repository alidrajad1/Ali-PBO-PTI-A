package Tugas6.src.Praktikum;

import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk,
            int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getGaji() {
        return super.getGaji() * 1.10;
    }

    public String toString() {
        return super.toString()+ "\nDepartemen: " + departemen;
    }
}
