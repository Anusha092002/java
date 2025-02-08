/**
 * 
 */
package com.wipro.java.java8features.usecase;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

/**
 * 
 */
public class EmployeManagement {
	public static void main(String a[]) {
		Scanner scanner= new Scanner(System.in);
		
		EmployeeService service = new EmployeeService(); 
		service.addEmployee(new Employee(1, "Anusha", "IT", 50000, LocalDate.of(2023, 5, 10)));        
		service.addEmployee(new Employee(2, "Napheesha", "HR", 45000, LocalDate.of(2014, 3, 15)));         
		service.addEmployee(new Employee(3, "Anjith", "Finance", 60000, LocalDate.of(2023, 8, 22))); 
		while (true) {
            try {
                System.out.println("\n------ Employee Management System ------");
                System.out.println("1. Add Employee");
                System.out.println("2. Remove Employee");
                System.out.println("3. Search Employee");
                System.out.println("4. Update Salary");
                System.out.println("5. Display All Employees");
                System.out.println("6. Filter by Department");
                System.out.println("7. Sort by Name");
                System.out.println("8. Get Average Salary");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            System.out.print("Enter Name: ");
                            String name = scanner.nextLine();

                            System.out.print("Enter Department: ");
                            String dept = scanner.nextLine();

                            System.out.print("Enter Salary: ");
                            double salary = scanner.nextDouble();

                            service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter the correct data types.");
                            scanner.nextLine(); // Clear buffer
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Enter Employee ID to Remove: ");
                            int removeId = scanner.nextInt();
                            service.removeEmployee(removeId);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Employee ID must be a number.");
                            scanner.nextLine(); // Clear buffer
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Enter Employee ID to Search: ");
                            int searchId = scanner.nextInt();
                            Optional<Employee> emp = service.searchEmployee(searchId);
                            System.out.println(emp.orElse(null));
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Employee ID must be a number.");
                            scanner.nextLine(); // Clear buffer
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Enter Employee ID to Update Salary: ");
                            int updateId = scanner.nextInt();

                            System.out.print("Enter New Salary: ");
                            double newSalary = scanner.nextDouble();

                            service.updateSalary(updateId, newSalary);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Employee ID and Salary must be numbers.");
                            scanner.nextLine(); // Clear buffer
                        }
                        break;

                    case 5:
                        service.displayEmployees();
                        break;

                    case 6:
                        try {
                            System.out.print("Enter Department: ");
                            String department = scanner.nextLine();

                            List<Employee> filtered = service.filterByDepartment(department);
                            filtered.forEach(System.out::println);
                        } catch (NoSuchElementException e) {
                            System.out.println("Department not found!");
                        }
                        break;

                    case 7:
                        List<Employee> sorted = service.sortByName();
                        sorted.forEach(System.out::println);
                        break;

                    case 8:
                        System.out.println("Average Salary: " + service.getAverageSalary());
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the buffer
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

}
}
