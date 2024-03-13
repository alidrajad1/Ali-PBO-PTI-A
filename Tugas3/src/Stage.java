public class Stage {
    private int level;
    private String kesulitan;

    public Stage(int level, String kesulitan) {
        this.level = level;
        this.kesulitan = kesulitan;
    }

    
    public void displayInfoStage() {
        System.out.println("Level: " + level + ", Kesulitan: " + kesulitan);
    }
    
    public void ubahKesulitan(String ubah) {
        this.kesulitan = ubah;
        System.out.println("Kesulitan di ubah ke " + kesulitan);
    }
    
    public void levelUp(int tambah) {
        this.level += tambah;
        System.out.println("Stage telah naik ke level " + this.level);
    }

    public int setLevel() {
        return level;
    }

    public String setKesulitan() {
        return kesulitan;
    }

}
