package com.yee.springmvc.dao;

import com.yee.springmvc.bean.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {

    public Employee getEmployeeById(int id);

    public void addEmployee(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmpById(int id);
}
