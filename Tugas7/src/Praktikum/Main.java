package Praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kue[] kueArray = new Kue[20];
        boolean exit = false;

        // Mengisi array dengan objek kue
        for (int i = 0; i < kueArray.length; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("Kue Pesanan " + i, 10.0 + i, i + 1);
            } else {
                kueArray[i] = new KueJadi("Kue Jadi " + i, 15.0 + i, i + 2);
            }
        }

        kueArray[18] = new KueBasi("Kue Basi", 30.0, 5);
        kueArray[19] = new KueBasi("Kue Basi 2", 25.0, 3);

        while (!exit) {
            System.out.println("Pilih opsi menu:");
            System.out.println("1. Tampilkan semua kue dan jenisnya");
            System.out.println("2. Hitung total harga semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("7. Keluar");

            int menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.println("Daftar Semua Kue:");
                    for (Kue kue : kueArray) {
                        System.out.println(kue.toString());
                    }
                    break;
                case 2:
                    double totalHarga = 0;
                    for (Kue kue : kueArray) {
                        totalHarga += kue.hitungHarga();
                    }
                    System.out.println("Total Harga Semua Kue: $" + totalHarga+"\n");
                    break;
                case 3:
                    double totalHargaPesanan = 0;
                    double totalBeratPesanan = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KuePesanan) {
                            totalHargaPesanan += kue.hitungHarga();
                            totalBeratPesanan += ((KuePesanan) kue).getBerat();
                        }
                    }
                    System.out.println("Total Harga Kue Pesanan: $" + totalHargaPesanan);
                    System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan + " kg\n");
                    break;
                case 4:
                    double totalHargaJadi = 0;
                    double totalJumlahJadi = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueJadi) {
                            totalHargaJadi += kue.hitungHarga();
                            totalJumlahJadi += ((KueJadi) kue).getJumlah();
                        }
                    }
                    System.out.println("Total Harga Kue Jadi: $" + totalHargaJadi);
                    System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi+"\n");
                    break;
                case 5:
                    double hargaTerbesar = 0;
                    Kue kueTerbesar = null;
                    for (Kue kue : kueArray) {
                        if (kue.hitungHarga() > hargaTerbesar) {
                            hargaTerbesar = kue.hitungHarga();
                            kueTerbesar = kue;
                        }
                    }
                    if (kueTerbesar != null) {
                        System.out.println("\nKue dengan Harga Terbesar:");
                        System.out.println(kueTerbesar.toString()+"\n");
                    } else {
                        System.out.println("Tidak ada kue dengan harga terbesar.\n");
                    }
                    break;
                case 6:
                    double totalHargaBasi = 0;
                    int totalLamaHari = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueBasi) {
                            totalHargaBasi += kue.hitungHarga();
                            totalLamaHari += ((KueBasi) kue).getLamaHari();
                        }
                    }
                    System.out.println("Total Harga Kue Basi: $" + totalHargaBasi);
                    System.out.println("Total Lama Hari Kue Basi: " + totalLamaHari + " hari\n");
                    break;
                case 7:
                    exit = true;
                    System.out.println("Program selesai.\n");
                    break;
                default:
                    System.out.println("Opsi menu tidak valid. Silakan pilih opsi yang sesuai.\n");
                    break;
            }
        }
        input.close();
    }
}

