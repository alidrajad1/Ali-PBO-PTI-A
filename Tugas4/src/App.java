public class App {
    public static void main(String[] args) {
        Karakter char1 = new Karakter("Qiqi", 2000, 86);
        Karakter char2 = new Karakter(5000, 112);
        Karakter char3 = new Karakter();
        Karakter char4 = char1.cloneKarakter();

        char1.Serang();
        char1.Serang(2);
        char1.Serang(char2);

        char4.tampilkanInfo();
        


    }
}
