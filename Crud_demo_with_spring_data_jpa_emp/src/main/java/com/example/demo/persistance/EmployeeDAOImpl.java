package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	EntityManager entitymanager;
	
	@Override
	public List<Employee> findall() {
		Session currentsession=entitymanager.unwrap(Session.class);
		Query<Employee> query=currentsession.createQuery("from Employee",Employee.class);
		List<Employee> li = query.getResultList();
		return li;
	}

	@Override
	public Employee findById(int id) {
		Session currentsession=entitymanager.unwrap(Session.class);
		return currentsession.get(Employee.class,id);
			}

	@Override
	public void save(Employee employee) {
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(employee);
	}

	@Override
	public void deleteById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		Query query=session.createQuery("delete from Employee where id=:employeeid");
		query.setParameter("employeeid",id);
		query.executeUpdate();
		
	}

}
