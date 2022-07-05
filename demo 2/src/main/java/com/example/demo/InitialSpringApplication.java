package com.example.demo;

import com.example.demo.dao.user1Repo;
import com.example.demo.dao.userRepo;
import com.example.demo.entities.UserRecord;
import com.example.demo.entities.user1Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InitialSpringApplication implements InitialSpringApplication1 {
	@Autowired
	private userRepo urp;
	@Autowired
	private user1Repo urp1;

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(InitialSpringApplication.class, args);

//		record = context.getBean(UserRecord.class);
//
//		UserRecord record1 = new UserRecord();
//		record1.setId(10);
//		record1.setName("Ayush");
//		record1.setPh(99345735);
//		UserRecord save = record.save(record1);
//		System.out.println(save);

	}

	//one to one mapping
	@Override
	public  void run() throws Exception
	{
		UserRecord record = new UserRecord();
		user1Record rcd1 = new user1Record();
        user1Record rd2 = new user1Record();
		record.getItems().add(rcd1);
		record.getItems().add(rd2);

		record.setUser1(rcd1);
		urp.save(record);
	}

}
