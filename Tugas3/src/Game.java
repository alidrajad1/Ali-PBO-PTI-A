public class Game {

    public static void main(String[] args) {

        Karakterr char1 = new Karakterr("Keqing", 21000, 2300);
        Karakterr char2 = new Karakterr("Lawacurl", 37000, 2100);

        char1.serang(char2);
        char2.pemulihan(1239);
        char1.menerimaDamage(3421);

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
