package com.yee.springmvc.mapper;

import com.yee.springmvc.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface EmployeeMapper {

    public Employee getEmployeeById(int id);

    public void addEmployee(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmpById(int id);
}
