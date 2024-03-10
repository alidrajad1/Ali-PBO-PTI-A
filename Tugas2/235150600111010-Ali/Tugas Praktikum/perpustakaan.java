import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Perpustakaan {
    private Map<String, List<Buku>> sKategori;

    public Perpustakaan() {
        sKategori = new HashMap<>();

        sKategori.put("Teknologi", new ArrayList<>());
        sKategori.put("Filsafat", new ArrayList<>());
        sKategori.put("Sejarah", new ArrayList<>());
        sKategori.put("Agama", new ArrayList<>());
        sKategori.put("Psikologi", new ArrayList<>());
        sKategori.put("Politik", new ArrayList<>());
        sKategori.put("Fiksi", new ArrayList<>());
    }

    public void addBuku(String kategori, Buku buku) {
        List<Buku> bukuBuku = sKategori.get(kategori);
        if (bukuBuku != null) {
            bukuBuku.add(buku);
            sKategori.put(kategori, bukuBuku);
        } else {
            System.out.println("Kategori tidak valid: " + sKategori);
        }
    }
    public List<Buku> getBukuByKategori(String kategori){
        return sKategori.get(kategori);
    }
   
}
