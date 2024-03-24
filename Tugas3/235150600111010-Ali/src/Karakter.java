public class Karakter {
    private String nama;
    private int healthPoint;
    private int damage;
    public String setNama;

    public Karakter(String nama, int healthPoint, int damage) {
        this.nama = nama;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    public void serang(Karakter target) {
        System.out.println(this.nama + " menyerang " + target.nama + " dengan damage " + this.damage);
        target.menerimaDamage(this.damage);
    }

    public void menerimaDamage(int damage) {
        this.healthPoint -= damage;
        System.out.println(this.nama + " menerima damage " + damage + ". Health point sekarang: " + this.healthPoint);
    }

    public void pemulihan(int healing) {
        this.healthPoint += healing;
        System.out.println(this.nama + " ditambahkan health point sebesar " + healing + ". Health point sekarang: "
                + this.healthPoint);
    }
    
    public String getNama() {
        return nama;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDamage() {
        return damage;
    }

}
