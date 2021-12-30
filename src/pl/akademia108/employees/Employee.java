package pl.akademia108.employees;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private Double salary;

    public Employee(String name, String surname, String position, Double salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

}
