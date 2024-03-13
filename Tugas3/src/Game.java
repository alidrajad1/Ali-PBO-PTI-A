public class Game {

    public static void main(String[] args) {

        Karakter char1 = new Karakter("Keqing", 1000, 25);
        Karakter char2 = new Karakter("Hillicurl", 1200, 30);

        char1.serang(char2);
        char2.pemulihan(25);
        char1.menerimaDamage(20);


        Senjata Sword = new Senjata("Primordial jade cutter", 214);

        Sword.displayInfoSenjata();
        Sword.upgradeSenjata(20);
        Sword.refineSenjata();
        

        Stage floor1 = new Stage(1, "Mudah");

        floor1.displayInfoStage();
        floor1.levelUp(1);
        floor1.ubahKesulitan("Sulit");
        floor1.displayInfoStage();
    }

}
