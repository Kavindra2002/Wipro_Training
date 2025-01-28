package Java8featureStreamApi_HW;

import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

public class StreamApiExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR", 6000),
                new Employee("Jane", "IT", 8000),
                new Employee("Doe", "HR", 4500),
                new Employee("Alice", "Finance", 7500),
                new Employee("Bob", "IT", 9000),
                new Employee("Eve", "Finance", 5500)
        );

        // 1. Find Employee with Highest Salary
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employee with Highest Salary: " + highestPaidEmployee.orElse(null));

        // 2. Filter Employees with Salary Greater Than 5000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .collect(Collectors.toList());
        System.out.println("\nEmployees with Salary > 5000:");
        highSalaryEmployees.forEach(System.out::println);

        // 3. Get Employee Names and Salaries
        Map<String, Double> employeeNamesAndSalaries = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println("\nEmployee Names and Salaries:");
        employeeNamesAndSalaries.forEach((name, salary) ->
                System.out.println("Name: " + name + ", Salary: " + salary));

        // 4. Count Employees
        long employeeCount = employees.stream().count();
        System.out.println("\nTotal Employees: " + employeeCount);

        // 5. Group Employees by Department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("\nEmployees Grouped by Department:");
        employeesByDepartment.forEach((department, empList) -> {
            System.out.println("Department: " + department);
            empList.forEach(System.out::println);
        });

        // 6. Calculate Average Salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage Salary: " + averageSalary);

        // 7. Sort Employees by Salary
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("\nEmployees Sorted by Salary:");
        sortedEmployees.forEach(System.out::println);

        // 8. Find Employee with Second Highest Salary
        Optional<Employee> secondHighestPaidEmployee = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println("\nEmployee with Second Highest Salary: " + secondHighestPaidEmployee.orElse(null));

        // 9. Partition Employees by Salary Threshold
        Map<Boolean, List<Employee>> partitionedEmployees = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 5000));
        System.out.println("\nPartitioned Employees (Salary > 5000):");
        partitionedEmployees.forEach((key, empList) -> {
            System.out.println("Salary > 5000: " + key);
            empList.forEach(System.out::println);
        });

        // 10. Find Employee with Longest Name
        Optional<Employee> employeeWithLongestName = employees.stream()
                .max(Comparator.comparingInt(e -> e.getName().length()));
        System.out.println("\nEmployee with Longest Name: " + employeeWithLongestName.orElse(null));

        // 11. Group Employees by Department and Calculate Average Salary
        Map<String, Double> avgSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println("\nAverage Salary by Department:");
        avgSalaryByDepartment.forEach((department, avgSalary) ->
                System.out.println("Department: " + department + ", Average Salary: " + avgSalary));

        // 12. Find Top 3 Highest Paid Employees
        List<Employee> top3HighestPaidEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("\nTop 3 Highest Paid Employees:");
        top3HighestPaidEmployees.forEach(System.out::println);

        // 13. Calculate Total Salary of All Employees Using Reduce
        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .reduce(0, Double::sum);
        System.out.println("\nTotal Salary of All Employees: " + totalSalary);
    }
}
