import java.util.Scanner;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private double saldo;
    private int pin;
    private int jenisRekening; // 38: silver, 56: gold, 74: platinum
    private int kesalahanAutentifikasi;

    public Pelanggan(String nama, String nomorPelanggan, double saldo, int pin) {
        this.pin = pin;
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
        this.saldo = saldo;
        this.jenisRekening = Integer.parseInt(nomorPelanggan.substring(0, 2));
        this.kesalahanAutentifikasi = 0; 
    }

    public String getNama() {
        return nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getJenisRekening() {
        return jenisRekening;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean topUp(double jumlah, int pin) {
        if (pin != getPin()) { 
            kesalahanAutentifikasi++;
            if (kesalahanAutentifikasi >= 3) {
                System.out.println("Akun Anda telah diblokir!");
            } else {
                System.out.println("PIN salah, kesalahan autentifikasi: " + kesalahanAutentifikasi);
            }
            return false;
        }
        saldo += jumlah;
        System.out.println("Top up berhasil. Saldo sekarang: " + saldo);
        return true;
    }

    public boolean beli(double jumlah, int pin) {
        if (pin != getPin()) { 
            kesalahanAutentifikasi++;
            if (kesalahanAutentifikasi >= 3) {
                System.out.println("Akun Anda telah diblokir!");
            } else {
                System.out.println("PIN salah, kesalahan autentifikasi: " + kesalahanAutentifikasi);
            }
            return false;
        }

        double cashback = 0;
        if (jenisRekening == 38) { // Silver
            if (jumlah > 1000000) {
                cashback = 0.05 * jumlah;
            }
        } else if (jenisRekening == 56) { // Gold
            if (jumlah > 1000000) {
                cashback = 0.07 * jumlah;
            }
            cashback += 0.02 * jumlah; 
        } else if (jenisRekening == 74) { // Platinum
            if (jumlah > 1000000) {
                cashback = 0.1 * jumlah;
            }
            cashback += 0.05 * jumlah; 
        }

        if (saldo + cashback < 10000) {
            System.out.println("Transaksi gagal. Saldo minimal tidak terpenuhi.");
            return false;
        }

        saldo += cashback;
        saldo -= jumlah;
        System.out.println("Transaksi berhasil. Cashback: " + cashback + ", Saldo sekarang: " + saldo);
        return true;
    }
}