package Percobaan;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Create objects for testing
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "123456789", 5000000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Doe", "987654321", 100000, 45);
        CommissionEmployee commissionEmployee = new CommissionEmployee("James Smith", "456789123", 10000000, 0.1);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Jenny Smith", "654321987", 5000000, 0.15, 2000000);

        // Set birthdates for testing
        salariedEmployee.setBirthdate(LocalDate.of(1990, 5, 15)); // Assuming birthday is in May
        hourlyEmployee.setBirthdate(LocalDate.of(1995, 10, 20)); // Assuming birthday is in October
        commissionEmployee.setBirthdate(LocalDate.of(1985, 3, 25)); // Assuming birthday is in March
        basePlusCommissionEmployee.setBirthdate(LocalDate.of(1998, 12, 10)); // Assuming birthday is in December

        // Calculate earnings polymorphically
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};
        for (Employee employee : employees) {
            double earnings = employee.earnings();
            if (employee.isBirthdayMonth()) {
                earnings += 100000; // Add bonus if it's their birthday month
            }
            System.out.printf("%s pendapatan : %.2f%n", employee.getName(), earnings);
        }
    }
}

