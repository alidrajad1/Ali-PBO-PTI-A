public class Senjata {
    private String nama;
    private int damage;

    public Senjata(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }
    
    public void displayInfoSenjata() {
        System.out.println("Senjata: " + nama + ", Damage: " + damage);
    }
    
    public void upgradeSenjata(int upgrade) {
        this.damage += upgrade;
        System.out.println("Senjata " + this.nama + " telah ditingkatkan. Damage sekarang: " + this.damage);
    }

    public void refineSenjata() {
        System.out.println("Senjata " + this.nama + " telah dirifine.");
    }

    public String getNama() {
        return nama;
    }

    public int getDamage() {
        return damage;
    }

}
