import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Perpustakaan {
    private Map<String, List<Buku>> sKategori;

    public Perpustakaan() {
        sKategori = new HashMap<>();
        daftarKategori();
    }

    private void daftarKategori() {
        sKategori.put("Teknologi", new ArrayList<>());
        sKategori.put("Sejarah", new ArrayList<>());
        sKategori.put("Filsafat", new ArrayList<>());
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
            System.out.println("Kategori tidak valid: " + kategori);
        }
    }

    public List<Buku> getBukuByKategori(String kategori) {
        return sKategori.get(kategori);
    }

    public List<Buku> cariJudul(String judul) {
        return sKategori.values().stream()
                .flatMap(List::stream)
                .filter(buku -> buku.getJudul().toLowerCase().contains(judul.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Buku> cariPengarang(String pengarang) {
        return sKategori.values().stream()
                .flatMap(List::stream)
                .filter(buku -> buku.getPengarang().stream().anyMatch(p -> p.toLowerCase().contains(pengarang.toLowerCase())))
                .collect(Collectors.toList());
    }

    public List<Buku> cariKategori(String kategori) {
        return sKategori.getOrDefault(kategori, new ArrayList<>());
    }

    public String getKategoriByBuku(Buku buku) {
        for (Map.Entry<String, List<Buku>> entry : sKategori.entrySet()) {
            if (entry.getValue().contains(buku)) {
                return entry.getKey();
            }
        }
        return null;
    }
}