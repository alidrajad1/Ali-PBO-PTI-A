import java.util.List;

public class mainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.addBuku("Teknologi", new Buku("Clean Code", List.of("Robert C. Martin")));
        perpustakaan.addBuku("Teknologi", new Buku("Design Patterns", List.of("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides")));
        perpustakaan.addBuku("Teknologi", new Buku("The Pragmatic Programmer", List.of("Andrew Hunt", "David Thomas")));
        perpustakaan.addBuku("Teknologi", new Buku("Refactoring", List.of("Martin Fowler")));
        perpustakaan.addBuku("Teknologi", new Buku("Code Complete", List.of("Steve McConnell")));

        List<Buku> bukuTeknologi = perpustakaan.getBukuByKategori("Teknologi");
        System.out.println("Buku dalam kategori Teknologi:");
        for (Buku buku : bukuTeknologi) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Penulis: " + String.join(", ", buku.getPengarang()));
            System.out.println();
        }
        System.out.println("=================================");
        System.out.println();

        Perpustakaan perpustakaan2 = new Perpustakaan();

        perpustakaan2.addBuku("Filsafat", new Buku("Meditations", List.of("Marcus Aurelius")));
        perpustakaan2.addBuku("Filsafat", new Buku("Thus Spoke Zarathustra", List.of("Friedrich Nietzsche")));
        perpustakaan2.addBuku("Filsafat", new Buku("The Republic", List.of("Plato")));
        perpustakaan2.addBuku("Filsafat", new Buku("Beyond Good and Evil", List.of("Friedrich Nietzsche")));
        perpustakaan2.addBuku("Filsafat", new Buku("Critique of Pure Reason", List.of("Immanuel Kant")));

        List<Buku> bukuFilsafat = perpustakaan2.getBukuByKategori("Filsafat");
        System.out.println("Buku dalam kategori Filsafat:");
        for (Buku buku : bukuFilsafat) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Penulis: " + String.join(", ", buku.getPengarang()));
            System.out.println();
        }
        System.out.println("=================================");
        System.out.println();
    }
}