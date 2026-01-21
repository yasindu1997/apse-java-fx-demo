package lk.acpt.demofx.service;

import lk.acpt.demofx.dto.Employee;

public interface EmployeeService {
    boolean saveEmployee(Employee employee);
    Employee searchEmployee(String nic);
}
