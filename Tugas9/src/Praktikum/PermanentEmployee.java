package Tugas9.src.Praktikum;

public class PermanentEmployee extends Employee {
    private String department;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String department) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void performDuties() {
        System.out.println("Performing duties of a permanent employee.");
    }

    @Override
    public String methodEmployeeType() {
        return "Permanent Employee";
    }
}

