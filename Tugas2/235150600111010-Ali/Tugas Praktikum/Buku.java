import java.util.List;


public class Buku {
    private String judul;
    private List<String> pengarang;
    
    public Buku(String judul, List<String> pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public List<String> getPengarang() {
        return pengarang;
    }
}