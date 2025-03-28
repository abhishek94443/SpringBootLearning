package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhishek.entity.Account;
import com.abhishek.entity.AccountPK;
import com.abhishek.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	     ConfigurableApplicationContext context =	SpringApplication.run(Application.class, args);
	     AccountRepo bean = context.getBean(AccountRepo.class);
	     AccountPK pk = new AccountPK();
	     pk.setAccNum(12735251783l);
	     pk.setAccType("Saving");
	     
	     Account acc= new Account();
	     acc.setHolderName("Abhishek");
	     acc.setBranch("Shahdol");
	     acc.setAccountPK(pk);
	     
	     bean.save(acc);
	     System.out.println("Records saved");
	
	}

}
