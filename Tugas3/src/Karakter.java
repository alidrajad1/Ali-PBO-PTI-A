public class Karakter {
    private String nama;
    private int healtPoint;
    private int damage;

    public Karakter(String nama, int healtPoint, int damage) {
        this.nama = nama;
        this.healtPoint = healtPoint;
        this.damage = damage;
    }
    
    public String getNama() {
        return nama;
    }

    public int getHealtPoint() {
        return healtPoint;
    }

    public int getDamage() {
        return damage;
    }
}