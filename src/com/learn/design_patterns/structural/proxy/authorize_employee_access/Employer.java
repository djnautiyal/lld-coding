package com.learn.design_patterns.structural.proxy.authorize_employee_access;

public class Employer {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.create("admin", new Employee(1, "John Wick", "admin"));
        employeeDao.create("user", new Employee(2, "Jane Doe", "user"));
        employeeDao.create("admin", new Employee(2, "Jane Doe", "user"));
        employeeDao.create("admin", new Employee(3, "David Johnson", "user"));
        employeeDao.get("user", 2);
        employeeDao.get("admin", 1);
        employeeDao.delete("admin", 1);
        employeeDao.delete("user", 3);

    }
}
