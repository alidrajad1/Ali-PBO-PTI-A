import java.util.Scanner;

public class mainManagerKarakter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int pilihan;

        do{
            System.out.println("MANAGER KARAKTER GAME");
        System.out.println("1. Tambahkan karakter");
        System.out.println("2. Tampillkan karakter");
        System.out.println("3. Perbarui karakter");
        System.out.println("4. Hapus karakter");
        System.out.println("5. Tutup");
        System.out.print("Masukkan pilihan: ");
        pilihan = in.nextInt();
        
        
        switch (pilihan) {
            case 1:
                managerKarakter.tambahKarakter();
                break;
            case 2:
                managerKarakter.tampilkanSemuaKarakter();
                break;
            case 3:
                managerKarakter.perbaruiKarakter();
                break;
            case 4:
                managerKarakter.hapusKarakter();
                break;
            case 5:
            System.out.println("halaman ditutup.");
                break;
        
            default:
            System.out.println("Pilihan tidak valid.");
                break;
        }
        } while (pilihan != 4);
            in.close();
        
    }
}
