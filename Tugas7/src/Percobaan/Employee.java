package Percobaan;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate birthdate; // tambahkan atribut tanggal lahir

    public Employee(String name, String noKTP) {
        this.name = name;
        this.noKTP = noKTP;
    }

    public Employee(String name, String noKTP, LocalDate birthdate) {
        this.name = name;
        this.noKTP = noKTP;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public LocalDate getBirthdate() { // tambahkan accessor untuk tanggal lahir
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) { // tambahkan mutator untuk tanggal lahir
        this.birthdate = birthdate;
    }

    public boolean isBirthdayMonth() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == birthdate.getMonth(); // mengecek apakah bulan ini adalah bulan ulang tahun
    }

    public String toString() {
        return String.format(" " + getName() + "\nNo. KTP :" + getNoKTP());
    }

    public abstract double earnings();// pendapatan

}