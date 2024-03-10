package Mobil;
public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    // private double kecepatan;
    // private double waktu;
    // private double jarak;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {

        kecepatan = i;
    }
    // public void setKecepatan(double d) {
    //     kecepatan = d;
    //     // rubahKecepatan(d);
    // }

    // public void rubahKecepatan(double mps) {
    //     kecepatan = mps * (1000.0/3600.0);
    // }

    // public void setWaktu(Double d) {
    //     waktu = d;
    //     // rubahSekon(waktu);
    // }

    // public void rubahSekon(double jam) {
    //     waktu = jam * 3600;
    // }
//     public double hitungJarak() {
//         return waktu * kecepatan;
// }
    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        // System.out.println("dalam waktu " + waktu + " jam");
        // System.out.println("dalam waktu " + waktu + " sekon");
        // System.out.printf("dan mampu menempuh kecepatan %.2f m/s\n",kecepatan);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/j");
        // System.out.printf("serta dapat menempuh jarak %.2f km\n", hitungJarak());
    }
}
