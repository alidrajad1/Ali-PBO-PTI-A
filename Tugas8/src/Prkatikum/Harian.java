package Tugas8.src.Prkatikum;

public class Harian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public Harian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji() {
        if (totalJam <= 40) {
            return (int) upahPerJam * totalJam;
        }
        return (int) (upahPerJam * totalJam) + ((totalJam - 40) * upahPerJam * 1.5);
    }

    @Override
    public String toString() {
        return super.toString()+String.format("\nUpah/Jam%10s%s \nTotal Jam Kerja%2s %s \nPendapatan%11s%s\n",": ",getUpahPerJam(),":", getTotalJam(),": Rp.",gaji());
    }
}
