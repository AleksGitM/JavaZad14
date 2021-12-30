package pl.akademia108.employees;

public class Manager extends Employee {

    private boolean isCEO;
    private Double rise;

    public Manager(String name, String surname, String position, Double salary) {
        super(name, surname, position, salary);
        this.isCEO = false;
    }

    public Manager(String name, String surname, String position, Double salary, boolean isCEO) {
        super(name, surname, position, salary);
        this.isCEO = isCEO;
    }
        public void giveRise(Employee employee, Double rise){
            if(this.isCEO){
                employee.setSalary(employee.getSalary() + rise);
            } else {
                System.out.println("Nie mogę dać podwyżki");
            }
        }
}
