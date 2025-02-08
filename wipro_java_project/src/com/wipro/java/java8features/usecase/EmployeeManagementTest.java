package com.wipro.java.java8features.usecase;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagementTest {
    private EmployeeService service;

    @Before
    public void setUp() { 
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Alice", "HR", 50000, LocalDate.of(2023, 5, 10)));
        service.addEmployee(new Employee(2, "Bob", "IT", 60000, LocalDate.of(2024, 6, 10)));
    }

    @Test
    public void testAddEmployee() { 
        Employee emp = new Employee(3, "Charlie", "Finance", 55000, LocalDate.of(2023, 5, 10));
        service.addEmployee(emp);
        Optional<Employee> found = service.searchEmployee(3);
        assertTrue(found.isPresent());
        assertEquals("Charlie", found.get().getName());
    }

    @Test
    public void testRemoveEmployee() { 
        service.removeEmployee(1);
        assertFalse(service.searchEmployee(1).isPresent());
    }

    @Test
    public void testSearchEmployee() { 
        Optional<Employee> emp = service.searchEmployee(2);
        assertTrue(emp.isPresent());
        assertEquals("Bob", emp.get().getName());
        assertNotEquals("John", emp.get().getName());
    }

    @Test
    public void testUpdateSalary() { 
        service.updateSalary(2, 75000);
        assertEquals(75000.0, service.searchEmployee(2).get().getSalary(), 0.001); 
    }

    @Test
    public void testGetAverageSalary() { 
        double avg = service.getAverageSalary();
        assertEquals(55000.0, avg, 0.01); 
    }

    @Test
    public void testFilterByDepartment() { 
        List<Employee> itEmployees = service.filterByDepartment("IT");
        assertEquals(1, itEmployees.size());
        assertEquals("Bob", itEmployees.get(0).getName());
    }

    @Test
    public void testSortByName() { 
        List<Employee> sorted = service.sortByName();
        assertEquals("Alice", sorted.get(0).getName());
        assertEquals("Bob", sorted.get(1).getName());
    }
}
