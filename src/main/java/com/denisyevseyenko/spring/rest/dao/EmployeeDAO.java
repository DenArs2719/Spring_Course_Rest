package com.denisyevseyenko.spring.rest.dao;

import com.denisyevseyenko.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(Employee employee);
}
