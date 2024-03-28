import java.util.*;

public class Transaksi {
    private Pelanggan account;
    private Scanner scanner;

    public Transaksi(Pelanggan account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public Pelanggan getAccount() {
        return account;
    }

    public void beli() {
        System.out.print("Masukkan nominal pembelian: ");
        double jumlahBeli = scanner.nextDouble();
        System.out.print("Masukkan PIN: ");
        int pinBeli = scanner.nextInt();
        account.beli(jumlahBeli, pinBeli);
    }

    public void topUp() {
        System.out.print("Masukkan nominal top up: ");
        double jumlahTopUp = scanner.nextDouble();
        System.out.print("Masukkan PIN: ");
        int pinTopUp = scanner.nextInt();
        account.topUp(jumlahTopUp, pinTopUp);
    }
}