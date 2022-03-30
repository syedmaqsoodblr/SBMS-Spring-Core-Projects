package com.maq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.Account;
import com.maq.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}