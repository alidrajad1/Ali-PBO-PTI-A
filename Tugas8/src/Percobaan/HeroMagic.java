package Tugas8.src.Percobaan;

public class HeroMagic extends Hero{
    String power = "Magic";

    public HeroMagic(String name, double health) {
        super(name, health);
    }
    
    public void display() {
        System.out.println(this.getName() + " is a " + this.power + " Hero.");
    }
}
