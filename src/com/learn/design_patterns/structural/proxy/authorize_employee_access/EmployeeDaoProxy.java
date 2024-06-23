package com.learn.design_patterns.structural.proxy.authorize_employee_access;

public class EmployeeDaoProxy implements EmployeeDao {
    @Override
    public void create(String access, Employee employee) {
        if(access.equals("admin")) {
            employeeDao.create(access, employee);
            System.out.println("Employee record created successfully!");
        }
        else System.out.println("Access Denied!");
    }

    @Override
    public void delete(String access, int id) {
        if(access.equals("admin")) {
            employeeDao.delete(access, id);
            System.out.println("Employee record deleted successfully!");
        }
        else System.out.println("Access Denied!");
    }

    @Override
    public void get(String access, int id) {
        if(access.equals("admin") || access.equals("user")) {
            employeeDao.get(access, id);
        }
        else System.out.println("Access Denied!");
    }

    private EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

}
