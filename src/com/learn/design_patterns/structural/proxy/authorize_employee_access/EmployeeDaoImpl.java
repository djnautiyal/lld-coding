package com.learn.design_patterns.structural.proxy.authorize_employee_access;

import java.util.HashMap;
import java.util.Map;

class EmployeeDaoImpl implements EmployeeDao {
    Map<Integer, Employee> employees;

    EmployeeDaoImpl() {
        employees = new HashMap<>();
    }

    @Override
    public void create(String access, Employee employee) {
        employees.put(employee.id(), employee);
    }

    @Override
    public void delete(String access, int id) {
        employees.remove(id);
    }

    @Override
    public void get(String access, int id) {
        System.out.println(employees.get(id));
    }
}
