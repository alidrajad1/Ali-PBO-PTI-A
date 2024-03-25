public class Karakter {
    private String nama;
    private int healtPoint;
    private int damage;

    public Karakter(String nama, int healtPoint, int damage) {
        this.nama = nama;
        this.healtPoint = healtPoint;
        this.damage = damage;
    }

    public Karakter(int healtPoint, int damage) {
        nama = "Zhongli";
        this.healtPoint = healtPoint;
        this.damage = damage;
    }

    public Karakter() {
        nama = "Kamisato Ayaka";
        healtPoint = 1000;
        damage = 132;
    }

    public void Serang() {
        System.out.println(this.nama + " Menyerang musuh dengan damage " + this.damage);
    }

    public void Serang(int critX) {
        System.out.println(this.nama + " Menyerang musuh dengan damage critical " + this.damage * critX);
    }

    public void Serang(Karakter musuh) {
        System.out.println(this.nama + " Menyerang" + musuh.nama + " dengan damage " + this.damage);
    }

    public Karakter getKarakter() {
        return this;
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

    public Karakter cloneKarakter() {
        return new Karakter(this.nama, this.healtPoint, this.damage);
    }

    public void tampilkanInfo() {
        System.out.println("Informasi: " + this.nama);
        System.out.println("Health Point: " + this.healtPoint);
        System.out.println("Damage: " + this.damage);
    }
}

