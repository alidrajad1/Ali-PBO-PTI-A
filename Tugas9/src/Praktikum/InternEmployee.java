package Tugas9.src.Praktikum;

public class InternEmployee extends Employee implements Contract {
    private String schoolName;
    private int contractDuration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String schoolName, int contractDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.schoolName = schoolName;
        this.contractDuration = contractDuration;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void doInternshipTasks() {
        System.out.println("Performing internship tasks.");
    }

    @Override
    public String methodEmployeeType() {
        return "Intern Employee";
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Attending training session as part of the contract.");
    }

    @Override
    public int trackContractDuration() {
        return contractDuration;
    }
}

