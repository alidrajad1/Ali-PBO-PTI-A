package Percobaan;

import java.time.LocalDate;

// public class Main { 
//     public static void main(String[] args) { 
//          Employee employee = new Employee(); 
//      } 
//  }

// public class Main {
//     public static void main(String[] args) {
//         SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
//         HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
//         CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
//         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000,
//                 .04, 300);
//         System.out.println("Employees diproses secara terpisah:\n");
//         System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
//         System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned",
//                 basePlusCommissionEmployee.earnings());

//         Employee[] employees = new Employee[4];
//         employees[0] = salariedEmployee;
//         employees[1] = hourlyEmployee;
//         employees[2] = commissionEmployee;

//         employees[3] = basePlusCommissionEmployee;
//         System.out.println("Employees diproses secara polimorfisme:\n");
//         for (Employee currentEmployee : employees) {
//             System.out.println(currentEmployee);
//             if (currentEmployee instanceof BasePlusCommissionEmployee) {
//                 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//                 employee.setBaseSalary(1.10 * employee.getBaseSalary());
//                 System.out.printf("Gaji  pokok  setelah  dinaikkan  10%%  : $%,.2f\n", employee.getBaseSalary());
//             }
//             System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
//         }
//         for (int j = 0; j < employees.length; j++) {
//             System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        LocalDate johnBirthdate = LocalDate.of(1990, 5, 15); // contoh tanggal lahir untuk John
        ProductionEmployee productionEmployee = new ProductionEmployee("John", "123", 10.50, 500, johnBirthdate);

        LocalDate janeBirthdate = LocalDate.of(1995, 8, 20); // contoh tanggal lahir untuk Jane
        ProductionEmployee anotherProductionEmployee = new ProductionEmployee("Jane", "456", 12.75, 700, janeBirthdate);

        // Objek dari kelas-kelas lain juga bisa tetap dibuat
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, LocalDate.of(1985, 3, 10));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", LocalDate.of(1992, 10, 25), 40, 16.75);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", LocalDate.of(1978, 12, 3), .06,
                10000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234",
                LocalDate.of(1998, 7, 15), .04, 300, 5000);

        // Menghitung gaji karyawan secara polimorfisme
        Employee[] employees = new Employee[] { productionEmployee, anotherProductionEmployee, salariedEmployee,
                hourlyEmployee, commissionEmployee, basePlusCommissionEmployee };

        for (Employee employee : employees) {
            System.out.printf("%s: $%,.2f\n", employee.getName(), employee.earnings());
        }
    }
}
