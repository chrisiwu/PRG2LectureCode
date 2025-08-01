package at.ac.fhcampuswien.block01.examples.example06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example06 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Bart Simpson", 100.10),
                new Employee(2, "Lisa Simpson", 9999.99),
                new Employee(3, "Homer Simpson", 2030.20),
        };
        Stream<Employee> streamFromArray = Arrays.stream(employees); // declare stream from array

//        streamFromArray
//                // intermediate operation
//                .filter(employee -> employee.getSalary() > 300.00)
//                // terminal operation
//                .forEach(employee -> {
//                    System.out.println(employee.getName());
//                });

        List<Employee> employeesList = Arrays.asList(employees);
        Stream<Employee> employeesStream = employeesList.stream(); // declare stream from list

//        employeesStream
//                // intermediate operation
//                .filter(employee -> employee.getSalary() > 300.00)
//                // terminal operation
//                .forEach(employee -> {
//                    System.out.println(employee.getName());
//                });

        // operations can be chained
        Employee firstEmployee = employeesStream
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 300.00)
                .findFirst()
                .orElse(null);

        System.out.println(firstEmployee.getName());

        // return a new list with collect
        List<Employee> sortedList = employeesList.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());

//        for (Employee employee : sortedList) {
//            System.out.println(employee.getName());
//        }
    }
}