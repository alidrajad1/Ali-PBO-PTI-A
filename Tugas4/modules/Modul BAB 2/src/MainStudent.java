package src;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        // Membuat objek Student anna dan mengatur informasinya menggunakan setter
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // Menggunakan constructor lain untuk membuat objek Student chris
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // Mengubah informasi alamat dan umur siswa dengan nama anna melalui constructor
        System.out.println("===================");
        anna = new Student("Anna", "Batu", 18);
        anna.displayMessage();

        // Mengubah informasi alamat dan umur siswa dengan nama chris melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        Student[] siswa = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            scanner.nextLine(); // Membersihkan buffer
            System.out.println("Masukkan informasi siswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            System.out.print("Nilai Matematika: ");
            int nilaiMatematika = scanner.nextInt();
            System.out.print("Nilai Bahasa Inggris: ");
            int nilaiBahasaInggris = scanner.nextInt();
            System.out.print("Nilai IPA: ");
            int nilaiIPA = scanner.nextInt();

            siswa[i] = new Student(nama, alamat, usia, nilaiMatematika, nilaiBahasaInggris, nilaiIPA);
        }

        scanner.close();

        // Tampilkan informasi semua siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            siswa[i].displayMessage();
            System.out.println("===================");
        }
    }
}
