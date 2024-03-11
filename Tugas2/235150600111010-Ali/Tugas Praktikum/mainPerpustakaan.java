import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class mainPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        cariBuku(perpustakaan, scanner);

        scanner.close();
    }


    private static void cariBuku(Perpustakaan perpustakaan, Scanner scanner) {
        System.out.println("Masukkan kriteria pencarian:");
        System.out.println("1. Judul");
        System.out.println("2. Pengarang");
        System.out.println("3. Kategori");
        System.out.println("4. Tambahkan buku");
        System.out.print("Pilih opsi (1/2/3/4): ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.print("Masukkan judul: ");
                String judul = scanner.nextLine();
                cariDariJudul(perpustakaan, judul);
                break;
            case 2:
                System.out.print("Masukkan nama pengarang: ");
                String pengarang = scanner.nextLine();
                cariDariPengarang(perpustakaan, pengarang);
                break;
            case 3:
                System.out.println("Kategori: Teknologi, Filsafat, Sejarah, Agama, Bahasa, Politik, Ekonomi");
                System.out.print("Masukkan kategori: ");
                String kategori = scanner.nextLine();
                cariDariKategori(perpustakaan, kategori);
                break;
            case 4:
                addBukuBaru(perpustakaan, scanner);
                break;
            default:
                System.out.println("Opsi tidak valid.");
        }
    }

    private static void cariDariJudul(Perpustakaan perpustakaan, String judul) {
        System.out.println("Hasil pencarian untuk judul \"" + judul + "\":");
        perpustakaan.cariJUdul(judul).forEach(book -> {
            System.out.println("Judul: " + book.getJudul());
            System.out.println("Penulis: " + String.join(", ", book.getPengarang()));
            System.out.println("Kategori: " + perpustakaan.getKategoriByBuku(book));
            System.out.println();
        });
    }

    private static void cariDariPengarang(Perpustakaan perpustakaan, String pengarang) {
        System.out.println("Hasil pencarian untuk pengarang \"" + pengarang + "\":");
        perpustakaan.cariPengarang(pengarang).forEach(book -> {
            System.out.println("Judul: " + book.getJudul());
            System.out.println("Penulis: " + String.join(", ", book.getPengarang()));
            System.out.println("Kategori: " + perpustakaan.getKategoriByBuku(book));
            System.out.println();
        });
    }

    private static void cariDariKategori(Perpustakaan perpustakaan, String kategori) {
        System.out.println("Hasil pencarian untuk kategori \"" + kategori + "\":");
        perpustakaan.cariKategori(kategori).forEach(book -> {
            System.out.println("Judul: " + book.getJudul());
            System.out.println("Penulis: " + String.join(", ", book.getPengarang()));
            System.out.println();
        });
    }

    private static void addBukuBaru(Perpustakaan perpustakaan, Scanner scanner) {
        System.out.println("Masukkan informasi buku yang ingin ditambahkan:");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Pengarang (pisahkan dengan koma jika lebih dari satu): ");
        String pengarangInput = scanner.nextLine();
        List<String> pengarang = Arrays.asList(pengarangInput.split(","));
        System.out.print("Kategori: ");
        String kategori = scanner.nextLine();

        perpustakaan.addBuku(kategori, new Buku(judul, pengarang));

        System.out.println("Buku berhasil ditambahkan.");

        cariBuku(perpustakaan, scanner);
    }
}
