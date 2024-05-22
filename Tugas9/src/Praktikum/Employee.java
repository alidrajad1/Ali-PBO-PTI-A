package Tugas9.src.Praktikum;

public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public double calculateTotalDeductions() {
        double totalDeductions = 0.0;
        for (Invoice invoice : invoices) {
            totalDeductions += invoice.getPayableAmount();
        }
        return totalDeductions;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salaryPerMonth);
        System.out.println("Invoices: ");
        for (Invoice invoice : invoices) {
            System.out.println("Product: " + invoice.getProductName() + ", Quantity: " + invoice.getQuantity() + ", Price per item: " + invoice.getPricePerItem());
        }
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - calculateTotalDeductions();
    }

    public static void companyPolicy() {
        System.out.println("Company Policy: All employees must adhere to the company's code of conduct.");
    }

    public abstract String methodEmployeeType();
}
