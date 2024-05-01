package Tugas6.src.Praktikum;

import java.time.LocalDate;

public class testCase {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "B", false, "111", false);
        System.out.println(b);

        Pekerja c = new Pekerja("C", true, "111", true, 1000, LocalDate.of(2016, 3, 2), 4);
        System.out.println(c);

        Manager d = new Manager("D", true, "111", true, 1000, LocalDate.of(2017, 1, 2), 3, "HRD");
        System.out.println(d);
    }
}
