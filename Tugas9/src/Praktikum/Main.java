package Tugas9.src.Praktikum;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices1 = {
            new Invoice("Laptop", 1, 15000000),
            new Invoice("Mouse", 2, 500000)
        };

        Invoice[] invoices2 = {
            new Invoice("Book", 3, 100000),
            new Invoice("Pen", 10, 20000)
        };

        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "John Doe", 8000000, invoices1, "IT Department");
        InternEmployee internEmployee = new InternEmployee(102, "Jane Smith", 3000000, invoices2, "University of XYZ", 6);

        permanentEmployee.displayEmployeeDetails();
        System.out.println("Total Payable Amount: " + permanentEmployee.getPayableAmount());
        permanentEmployee.performDuties();
        System.out.println("Employee Type: " + permanentEmployee.methodEmployeeType());

        System.out.println();

        internEmployee.displayEmployeeDetails();
        System.out.println("Total Payable Amount: " + internEmployee.getPayableAmount());
        internEmployee.doInternshipTasks();
        System.out.println("Employee Type: " + internEmployee.methodEmployeeType());
        internEmployee.attendTrainingSession();
        System.out.println("Contract Duration: " + internEmployee.trackContractDuration() + " months");

        System.out.println();

        Employee.companyPolicy();
    }
}

