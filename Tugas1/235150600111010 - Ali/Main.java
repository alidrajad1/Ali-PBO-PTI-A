import java.util.Scanner;

public class Main {

  static String[] Nim = {
      "235150600111010",
      "235150600111011",
      "235150600111012",
      "235150600111013",
  };
  static String[] Sandi = {
      "Password.1",
      "Password.2",
      "Password.3",
      "Password.4",
  };
  static boolean[] statusAkun = new boolean[Nim.length];

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    clearScreen();
    int pilihan;
    do {
      System.out.println("------------------------------------");
      System.out.println("SISTEM INFORMASI AKADEMIK MAHASISWA");
      System.out.println("====================================");
      System.out.println("Menu:");
      System.out.println("1. Masuk");
      System.out.println("2. Lupa sandi");
      System.out.println("3. Tutup");
      System.out.println("------------------------------------");
      System.out.print("Masukkan Pilihan: ");
      pilihan = input.nextInt();

      switch (pilihan) {
        case 1:
          Masuk(input);
          break;
        case 2:
          lupaSandi(input);
          break;
        case 3:
          clearScreen();
          System.out.println();
          System.out.println("HALAMAN DI TUTUP");
          System.out.println();
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilihan != 3);
    input.close();
  }

  static void Masuk(Scanner input) {
    clearScreen();
    System.out.println("MASUK KE AKUN");
    System.out.println("====================================");
    System.out.print("NIM: ");
    String nimInput = input.next();
    System.out.print("kata sandi: ");
    String sandiInput = input.next();
    for (int i = 0; i < Nim.length; i++) {
      if (Nim[i].equals(nimInput) && Sandi[i].equals(sandiInput)) {
        statusAkun[i] = true;
        clearScreen();
        System.out.println("BERHASIL MASUK KE AKUN!");
        System.out.println("====================================");
        int Pilihan;
        do {
          System.out.println("SELAMAT DATANG! " + nimInput);
          System.out.println("Menu: ");
          System.out.println("1. Keluar");
          System.out.println("2. Ganti kata sandi");
          System.out.print("Masukkan pilihan: ");
          Pilihan = input.nextInt();
          switch (Pilihan) {
            case 1:
              Keluar(i);
              return;
            case 2:
              gantiSandi(input);
              return;
            default:
              System.out.println("Pilihan tidak valid");
          }
        } while (Pilihan != 2);
        input.close();
      }
    }
    clearScreen();
    System.out.println();
    System.out.println("NIM ATAU SANDI SALAH");
    System.out.println();
  }

  static void lupaSandi(Scanner input) {
    clearScreen();
    System.out.println("PEMULIHAN AKUN");
    System.out.println("====================================");
    System.out.print("Masukkan NIM: ");
    String nimInput = input.next();
    System.out.print("Masukkan email: ");
    String Email = input.next();
    boolean akunAda = false;
    for (int i = 0; i < Nim.length; i++) {
      if (Nim[i].equals(nimInput) && Email.contains("@")) {
        clearScreen();
        akunAda = true;
        System.out.println();
        System.out.println(
            "Opsi pemulihan akun untuk NIM " +
                nimInput +
                " telah dikirimkan ke email " +
                Email);
        System.out.println();
        break;
      }
    }
    if (!akunAda) {
      clearScreen();
      System.out.println();
      System.out.println("NIM ATAU EMAIL SALAH!");
      System.out.println();
    }
  }

  static void gantiSandi(Scanner input) {
    clearScreen();
    System.out.println("GANTI KATA SANDI");
    System.out.println("====================================");
    System.out.print("Masukkan NIM: ");
    String nimInput = input.next();
    System.out.print("Masukkan email: ");
    String Email = input.next();
    boolean akunAda = false;
    for (int i = 0; i < Nim.length; i++) {
      if (Nim[i].equals(nimInput) && Email.contains("@")) {
        akunAda = true;
        clearScreen();
        System.out.println();
        System.out.println(
            "Buka email " + Email + " untuk mengganti sandi akun NIM " + nimInput);
        System.out.println();
        break;
      }
    }
    if (!akunAda) {
      clearScreen();
      System.out.println();
      System.out.println("NIM ATAU EMAIL SALAH!");
      System.out.println();
    }
  }

  static void Keluar(int index) {
    statusAkun[index] = false;
    clearScreen();
    System.out.println();
    System.out.println("BERHASIL KELUAR DARI AKUN!");
    System.out.println();
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
