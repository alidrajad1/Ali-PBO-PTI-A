package Percobaan;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, String noKTP, double weeklySalary, LocalDate birthdate) {
        super(name, noKTP, birthdate);
        this.weeklySalary = weeklySalary;
    }

    private double weeklySalary; // gaji/minggu

    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;

    }

    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}