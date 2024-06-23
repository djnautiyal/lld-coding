package com.learn.design_patterns.structural.proxy.authorize_employee_access;

public interface EmployeeDao {
    void create(String access, Employee employee);
    void delete(String access, int id);
    void get(String access, int id);
}

