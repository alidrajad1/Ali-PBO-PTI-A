import java.util.ArrayList;
import java.util.Scanner;

public class managerKarakter {
    private String nama;
    private int healthPoint;
    private int damage;
    private static int nomor = 1;
    private static ArrayList<managerKarakter> characters = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public managerKarakter(String nama, int healthPoint, int damage) {
        this.nama = nama;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }


    public static void tambahKarakter() {
        System.out.print("Masukkan nama karakter: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan health point: ");
        int healthPoint = scanner.nextInt();
        System.out.print("Masukkan damage: ");
        int damage = scanner.nextInt();
        characters.add(new managerKarakter(nama, healthPoint, damage));
        System.out.println("Karakter " + nama + " telah ditambahkan.");
    }

    public static void tampilkanSemuaKarakter() {
        if (characters.isEmpty()) {
            System.out.println("Tidak ada karakter yang tersedia.");
        } else {
            System.out.println("Daftar Karakter:");
            for (managerKarakter karakter : characters) {
                System.out.println(nomor + ". Nama: " + karakter.nama + ", Health Point: " + karakter.healthPoint + ", Damage: "
                        + karakter.damage);
            }
            nomor = 1;
        }
    }

    public static void perbaruiKarakter() {
        if (characters.isEmpty()) {
            System.out.println("Tidak ada karakter yang tersedia.");
            return;
        }
        tampilkanSemuaKarakter();
        System.out.print("Pilih karakter yang ingin diperbarui (nomor): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Clear newline character
        if (index >= 1 && index <= characters.size()) {
            managerKarakter karakter = characters.get(index - 1);
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            karakter.nama = namaBaru;
            System.out.println("Nama karakter berhasil diperbarui.");
        } else {
            System.out.println("Nomor karakter tidak valid.");
        }
    }

    public static void hapusKarakter() {
        if (characters.isEmpty()) {
            System.out.println("Tidak ada karakter yang tersedia.");
            return;
        }
        tampilkanSemuaKarakter();
        System.out.print("Pilih karakter yang ingin dihapus (nomor): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Clear newline character
        if (index >= 1 && index <= characters.size()) {
            characters.remove(index - 1);
            System.out.println("Karakter berhasil dihapus.");
        } else {
            System.out.println("Nomor karakter tidak valid.");
        }
    }

    // Getters and setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
