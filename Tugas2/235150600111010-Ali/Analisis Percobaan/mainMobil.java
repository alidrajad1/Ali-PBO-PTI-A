import java.util.Scanner;

public class mainMobil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // instan objek bernama m1
        // Mobil m1 = new Mobil();
        // System.out.print("Masukkan kecepatan: ");
        // int kecepatan = in.nextInt();
        // in.nextLine();
        // m1.setKecepatan(kecepatan);
        // System.out.print("Masukkan manufaktur: ");
        // String manufaktur = in.nextLine();
        // m1.setManufaktur(manufaktur);
        // System.out.print("Masukkan plat nomor: ");
        // String platNomor = in.nextLine();
        // m1.setNoPlat(platNomor);
        // System.out.print("Masukkan warna: ");
        // String warna = in.nextLine();
        // m1.setWarna(warna);
        // System.out.println("Masukkan Waktu: ");
        // Double waktu = in.nextDouble();
        // m1.setWaktu(waktu);
        // m1.displayMessage();
        // Mobil m1 = mobilBaru(in);
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.setWaktu(2.5);
        m1.displayMessage();
        System.out.println("================");
        // instan objek baru bernama m2
        // Mobil m2 = new Mobil();
        // System.out.print("Masukkan kecepatan: ");
        // int kecepatan2 = in.nextInt();
        // in.nextLine();
        // m2.setKecepatan(kecepatan2);
        // System.out.print("Masukkan manufaktur: ");
        // String manufaktur2 = in.nextLine();
        // m2.setManufaktur(manufaktur2);
        // System.out.print("Masukkan plat nomor: ");
        // String platNomor2 = in.nextLine();
        // m2.setNoPlat(platNomor2);
        // System.out.print("Masukkan warna: ");
        // String warna2 = in.nextLine();
        // m2.setWarna(warna2);
        // System.out.println("Masukkan Waktu: ");
        // Double waktu2 = in.nextDouble();
        // m2.setWaktu(waktu2);
        // m2.displayMessage();
        // Mobil m2 = mobilBaru(in);
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.setWaktu(1.5);
        m2.displayMessage();
        System.out.println("================");
        // merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        // menampilkan hasil perubahan
        m1.displayMessage();
    }

    // public static Mobil mobilBaru(Scanner in) {
    //     Mobil mobil = new Mobil();
    //     System.out.print("Masukkan kecepatan: ");
    //     int kecepatan = in.nextInt();
    //     in.nextLine();
    //     mobil.setKecepatan(kecepatan);
    //     System.out.print("Masukkan manufaktur: ");
    //     String manufaktur = in.nextLine();
    //     mobil.setManufaktur(manufaktur);
    //     System.out.print("Masukkan plat nomor: ");
    //     String platNomor = in.nextLine();
    //     mobil.setNoPlat(platNomor);
    //     System.out.print("Masukkan warna: ");
    //     String warna = in.nextLine();
    //     mobil.setWarna(warna);
    //     mobil.displayMessage();

    //     return mobil;
    // }

}
