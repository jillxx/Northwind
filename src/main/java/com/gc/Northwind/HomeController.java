package com.gc.Northwind;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.Northwind.DAO.customerDAO;
import com.gc.Northwind.entity.Customers;


@Controller
public class HomeController {
	@Autowired
	private customerDAO customerDAO;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Customers> customers = customerDAO.findAll();
		System.out.println(customers);
		return new ModelAndView("index", "customers", customers);
	}


	@RequestMapping("/addUser")
	public ModelAndView addUser(@RequestParam("customerID") String customerID, @RequestParam("companyName") String companyName, @RequestParam("contactName") String contactName, @RequestParam("contactTitle")String contactTitle){
		
	Customers customer = new Customers(customerID, companyName, contactName, contactTitle);	
		
		customerDAO.addUser(customer);
		return new ModelAndView("redirect:/");
		
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView update1(@RequestParam("customerID") String customerID){
		System.out.println(customerID);
	return new ModelAndView("updateCustomer","id",customerID);
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("customerID") String customerID,@RequestParam("companyName") String companyName,@RequestParam("contactName") String contactName, @RequestParam("contactTitle") String contactTitle){
		 
		Customers customer = new Customers(customerID,companyName,contactName, contactTitle);
		customerDAO.update(customer);
	
		return new ModelAndView("redirect:/");
	}
}
