package com.gc.Northwind.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gc.Northwind.entity.Customers;



@Repository
public class customerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;//jar from the spring framework
	
	public void addUser(Customers c) {
		String sql = "INSERT INTO customers (`CustomerID`, `CompanyName`, `ContactName`, `ContactTitle`) VALUES(?,?,?,?)";
	
		System.out.println(c);
		jdbcTemplate.update(sql, c.getCustomerID(), c.getCompanyName(), c.getContactName(),c.getContactTitle());
	}
	
	
	public List<Customers> findAll() {
		String sql = "SELECT*FROM customers";
		System.out.println(jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customers.class)));
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customers.class));
		
	}
	
	
	public void update(Customers c){
		
		String sql = "UPDATE customers SET CompanyName = ?, ContactName = ?,ContactTitle = ? WHERE CustomerID =?";
		jdbcTemplate.update(sql, c.getCompanyName(), c.getContactName(),c.getContactTitle(), c.getCustomerID());
	}
	
}
