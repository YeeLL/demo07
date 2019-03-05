package com.yee.springmvc;

import com.yee.springmvc.bean.Employee;
import com.yee.springmvc.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {
    public SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }

    @Test
    public void  selectTest() throws IOException {
        SqlSession session=getSqlSession();
        try {
            EmployeeMapper employee = session.getMapper(EmployeeMapper.class);
            System.out.println(employee.getEmployeeById(1).toString());
        }finally {
            session.close();
        }
    }
    @Test
    public void  addTest() throws IOException {
        SqlSession session=getSqlSession();
        Employee employee = new Employee();
        employee.setEmail("2399999@qqqq.com");
        employee.setGender("1");
        employee.setLastName("xiaoxinxin");
        try {
            EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
            employeeMapper.addEmployee(employee);
            session.commit();
        }finally {
            session.close();
        }
        System.out.println(employee.toString());
    }
    @Test
    public void  updateTest() throws IOException {
        SqlSession session=getSqlSession();
        Employee employee = new Employee();
        employee.setEmail("2399999@qqqq.com");
        employee.setGender("1");
        employee.setLastName("xiaoxinxin");
        employee.setId(1);
        try {
            EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
            employeeMapper.updateEmp(employee);
            session.commit();
        }finally {
            session.close();
        }
    }

    @Test
    public void  deleteTest() throws IOException {
        SqlSession session=getSqlSession();
        try {
            EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
            employeeMapper.deleteEmpById(5);
            session.commit();
        }finally {
            session.close();
        }
    }
}
