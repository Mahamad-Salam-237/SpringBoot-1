package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
@Primary
public class EmployeeDAO_jpa_Impl implements EmployeeDAO {
	@Autowired
	private EntityManager entitymanager;
	
	public EmployeeDAO_jpa_Impl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public List<Employee> findall() {
		Query query=entitymanager.createQuery("from Employee",Employee.class);
		List<Employee> li =query.getResultList();
		return li;
	}

	@Override
	public Employee findById(int id) {
		Employee emp=entitymanager.find(Employee.class,id);
		return emp;
	}

	@Override
	public void save(Employee employee) {
		Employee empdb =entitymanager.merge(employee);
		employee.setId(empdb.getId());
	}

	@Override
	public void deleteById(int id) {
		Query query=entitymanager.createQuery("delete from Employee where id=:empid");
		query.setParameter("empid",id);
		query.executeUpdate();
	}

	
	

}
