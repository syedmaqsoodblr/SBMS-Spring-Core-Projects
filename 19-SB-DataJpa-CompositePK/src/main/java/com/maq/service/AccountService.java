package com.maq.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maq.entity.Account;
import com.maq.entity.AccountPK;
import com.maq.repository.AccountRepository;

@Service
public class AccountService {

	private AccountRepository accRepo;
	
	// Constructor injection
	public AccountService(AccountRepository accRepo) {
		this.accRepo = accRepo;
	}

	public void getDataUsingPK() {

		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("CURRENT");
		pk.setHolderName("IBM");

		Optional<Account> findById = accRepo.findById(pk);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}
	}

	public void saveAccData() {

		AccountPK pk = new AccountPK();
		pk.setAccId(204);
		pk.setAccType("SAVINGS");
		pk.setHolderName("TCS");

		Account acc = new Account();
		acc.setBranchName("Ameerpet");
		acc.setMinBal(5000.00);
		acc.setAccPk(pk); // setting pk class obj to entity obj

		accRepo.save(acc);
	}
}