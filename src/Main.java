public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Шангин Богдан Левович", 1, 51_000);
        employees[1] = new Employee("Проскура Валерий Миронович", 2, 77_000);
        employees[2] = new Employee("Пушкин Юлий Агапови", 3, 65_000);
        employees[3] = new Employee("Андреевский Рюрик Игоревич", 4, 52_000);
        employees[4] = new Employee("Юрлов Карл Михаилович", 5, 59_000);
        employees[5] = new Employee("Казанькова Ольга Игоревна", 1, 61_000);
        employees[6] = new Employee("Максимушкина Ирина Ипполитовна", 2, 71_000);
        employees[7] = new Employee("Киселёва Инна Семеновна", 3, 54_000);
        employees[8] = new Employee("Игнатенкова Тамара Лаврентиевна", 4, 60_000);
        employees[9] = new Employee("Алифанова Марта Всеволодовна", 5, 68_000);

        fullInfoEmployee();
            totalSalary();
        System.out.println("Сумма всех зарплат: " + totalSalary());
        System.out.println("Минимальная зарплата: " + findMinSalaryEmployee());
        System.out.println("Максимальныя зарплата: " + findMaxSalaryEmployee());
        System.out.println("Средняя зарплата: " + findAverageSalary());
        printFullName();
    }

    public static void fullInfoEmployee(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();{
            }
        }
        return sum;
    }
    private static Employee findMinSalaryEmployee(){
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if(emp.getSalary() < min){
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static Employee findMaxSalaryEmployee(){
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : employees) {
            if(emp.getSalary() > max){
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static double findAverageSalary(){
        return totalSalary() / (double) employees.length;
    }
    private static void printFullName(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullNameEmployee());
        }
    }
}