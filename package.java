package employee_data;

public class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

    public boolean isEligibleForBonus(double salary) {
        return salary >= 50000;
    }
}

import employee_data.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Sweta", 101);
        emp.showDetails();

        double salary = 55000;
        if (emp.isEligibleForBonus(salary)) {
            System.out.println("Eligible for Bonus ✅");
        } else {
            System.out.println("Not Eligible for Bonus ❌");
        }
    }
}
