package com.abhishek.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.abhishek.entity.Account;
import com.abhishek.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK> {
	
	

}
