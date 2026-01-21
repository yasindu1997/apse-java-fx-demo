package lk.acpt.demofx.service.impl;

import lk.acpt.demofx.db.Database;
import lk.acpt.demofx.dto.Employee;
import lk.acpt.demofx.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public boolean saveEmployee(Employee employee) {
        boolean add = Database.employeeList.add(employee);
        return add;
    }

    @Override
    public Employee searchEmployee(String nic) {
        return null;
    }
}
