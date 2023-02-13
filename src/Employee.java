import java.util.Objects;

public class Employee {

    private final String fullNameEmployee;
    private int salary;
    private int department;
    private final int id;

    private static int count;

    public Employee (String fullNameEmployee, int department, int salary) {
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;
        id = 1 + count++;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && id == employee.id && fullNameEmployee.equals(employee.fullNameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameEmployee, salary, department, id);
    }

    @Override
    public String toString() {
        return "ФИО: " + fullNameEmployee + ", зарплата: " + salary +
                ", № отдела: " + department +
                ", id сотрудника: " + id;
    }
}
