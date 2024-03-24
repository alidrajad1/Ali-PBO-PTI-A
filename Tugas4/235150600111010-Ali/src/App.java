public class App {
    public static void main(String[] args) {
        Karakter char1 = new Karakter("Qiqi", 2000, 86);
        Karakter char2 = new Karakter(5000, 112);
        Karakter char3 = new Karakter();

        char1.menyerang();
        char1.menyerang(2);
        char1.menyerang(char2);

    }
}
