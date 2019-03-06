package com.yee.springmvc.service;

import com.yee.springmvc.bean.Employee;
import com.yee.springmvc.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {

    @Autowired
    private EmployeeMapper employeeMapper;


    public Employee getEmp(int id){
      return  employeeMapper.getEmployeeById(id);
    }

}
