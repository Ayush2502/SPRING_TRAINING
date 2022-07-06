package com.example.RelationalMapping;

import com.example.RelationalMapping.Dao.CustomerRepo;
import com.example.RelationalMapping.Dao.ItemsRepo;
import com.example.RelationalMapping.Entities.Customer;
import com.example.RelationalMapping.Entities.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelationalMappingApplication implements RelationalMappingApplication1 {

	@Autowired
	private ItemsRepo itemrepo;
	@Autowired
	private CustomerRepo customerrepo;
	public static void main(String[] args) {

		Customer cust = new Customer();
		cust.setId(10);
		cust.setName("Ayush");
		cust.setAddress("India");
		SpringApplication.run(RelationalMappingApplication.class, args);
	}
	@Override
	public void run() throws Exception
	{
        Customer customer = new Customer("Ayush");
//		Items items = new Items("Apple");
//		customer.setItems(items);

//		customerrepo.save(customer);

		Items items1 = new Items("Ayush");
		Items items2 = new Items("Piyush");
		customer.getItems().add(items1);
		customer.getItems().add(items2);

//		items1.setCustomer(customer);
//		items2.setCustomer(customer);

		customerrepo.save(customer);
	}

}
