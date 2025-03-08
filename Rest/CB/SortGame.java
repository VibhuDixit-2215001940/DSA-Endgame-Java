import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int N = sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int salary = sc.nextInt();
            employees.add(new Employee(name, salary));
        }
        employees.stream()
                .filter(emp -> emp.salary >= x)
                .sorted((emp1, emp2) -> {
                    if (emp1.salary != emp2.salary) {
                        return Integer.compare(emp2.salary, emp1.salary);
                    } else {
                        return emp1.name.compareTo(emp2.name);
                    }
                })
                .forEach(emp -> System.out.println(emp.name + " " + emp.salary));
    }

    static class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
