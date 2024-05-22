package Tugas9.src.Percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String namaManusia = in.nextLine();
        System.out.print("Masukkan umur: ");
        int umurManusia = in.nextInt();

        Manusia manusia = new Manusia(namaManusia, umurManusia);

        // Manusia manusia = new Manusia("Ali", 20);
        manusia.tampilkanNama();
        manusia.tampilkanUmur();
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();

        // System.out.print("Masukkan nama: ");
        // String namaHewan = in.nextLine();
        // System.out.print("Masukkan umur: ");
        // int umurHewan = in.nextInt();

        // Hewan hewan = new Hewan(namaHewan, umurHewan);
        Hewan hewan = new Hewan("Kucing", 1);
        hewan.tampilkanNama();
        hewan.tampilkanUmur();
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
    }
}
