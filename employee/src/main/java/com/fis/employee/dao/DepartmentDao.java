package com.fis.employee.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.fis.employee.SpringLearnConstants;
import com.fis.employee.bean.Department;
@Component
public class DepartmentDao {
	
	static ArrayList<Department> DEPARTMENT_LIST;
	public ArrayList<Department> getAllDepartments(){
		SpringLearnConstants.LOGGER.debug("Inside DepartmentDao Constructor");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = context.getBean("departmentList", ArrayList.class);
		for (Department department : DEPARTMENT_LIST) {
			SpringLearnConstants.LOGGER.debug(department.toString());
		}
		return DEPARTMENT_LIST;
	}
}
