package pl.akademia108;

import pl.akademia108.employees.Employee;
import pl.akademia108.employees.Manager;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John", "Madden", "Accountant" ,9980.90);

        Manager manager = new Manager("John", "Kowalski", "CEO", 65129.69, true);

        manager.giveRise(employee, 500.46);

        System.out.println("Salary: " + employee.getSalary());


    }
}
