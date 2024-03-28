import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = scanner.nextLine();
        System.out.print("Masukkan pin pelanggan: ");
        int pin = scanner.nextInt();
        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = scanner.nextDouble();

        Pelanggan pelanggan = new Pelanggan(nama, nomorPelanggan, saldoAwal, pin);
        Transaksi transaksi = new Transaksi(pelanggan);

        int pilihan;

        do {
            System.out.println("SWALAYAN TINY");
            System.out.println("1. Beli barang");
            System.out.println("2. Top up saldo");
            System.out.println("3. Tutup");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.beli();
                    break;
                case 2:
                    transaksi.topUp();
                    break;
                case 3:
                    System.out.println("Halaman ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 3);

        scanner.close();
    }
}